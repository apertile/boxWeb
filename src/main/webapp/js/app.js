'use strict';

/* App Module */

var boxApp = angular.module('boxApp', ['ngRoute']);

boxApp.directive('header', function () {
    return {
        restrict: 'A', //This means that it will be used as an attribute and NOT as an element
        replace: true,
        templateUrl: 'partials/header.html',
        controller: ['$scope', '$filter', function ($scope, $filter) {
            // Your behaviour goes here :)
        }]
    }
});