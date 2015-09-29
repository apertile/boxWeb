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