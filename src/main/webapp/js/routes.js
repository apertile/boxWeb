angular.module('boxApp').config(['$routeProvider',
                   	function($routeProvider) {
                   		$routeProvider.
                   			when('/home', {
                   				templateUrl: 'partials/home.html',
                   				controller: 'HomeController',
                   				controllerAs: 'HomeCtrl'
                   			}).
                   			when('/boxer/add', {
                   				templateUrl: 'partials/addBoxer.html',
                   				controller: 'AddBoxerController',
                   				controllerAs: 'AddBoxerCtrl'
                   			}).
                   			otherwise({
                   				redirectTo: '/home'
                   			});
                   	}
                   ]);