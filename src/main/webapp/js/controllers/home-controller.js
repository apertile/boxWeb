'use strict';

/* Controllers */

angular.module('boxApp')
	.controller('HomeController', ['$rootScope', '$scope', '$routeParams', '$http',
	  function($rootScope, $scope, $routeParams, $http) {
		$scope.createBoxer = function() {
			console.log('BEGIN createPerson');
			
			$http.post('api/createBoxer', {
					"userName": $scope.userName
					,"firstName": $scope.firstName
					,"lastName": $scope.lastName
			})
			.success(function(data, status, headers, config) {
				console.log('data = ' , data);
				$scope.userName = '';
				$scope.firstName = '';
				$scope.lastName = '';
				$scope.newUserId = data;
			})
			.error(function(data, status, headers, config) {
				console.log('error: data = ' , data);
			});
		};
		
		$scope.searchPerson = function() {
			$http.get('api/person/' + $scope.searchPersonId)
			.success(function(data, status, headers, config) {
				console.log('data = ' , data);
				$scope.person = data;
			})
			.error(function(data, status, headers, config) {
				console.log('error: data = ' , data);
			});
		};
	 }
]);