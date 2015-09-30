'use strict';

/* App Module */

var boxApp = angular.module('boxApp', [
	'ngRoute',
	'boxWebControllers'
]);

boxApp.config(['$routeProvider',
                   	function($routeProvider) {
                   		$routeProvider.
                   			when('/home', {
                   				templateUrl: 'partials/home.html',
                   				controller: 'HomeCtrl'
                   			}).
                   			otherwise({
                   				redirectTo: '/home'
                   			});
                   	}
                   ]);

boxApp.directive('header', function () {
    return {
        restrict: 'A', //This menas that it will be used as an attribute and NOT as an element. I don't like creating custom HTML elements
        replace: true,
        templateUrl: 'partials/header.html',
        controller: ['$scope', '$filter', function ($scope, $filter) {
            // Your behaviour goes here :)
        }]
    }
});