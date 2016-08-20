angular.module('boxApp').controller('AddBoxerController', addBoxerController);

function addBoxerController(citySearchService, $window, $log) {
	
	var vm = this;
	
	vm.searchCity = function (like) {
		citySearchService.getCityLike(like)
        .then(function (response) {
        	vm.myfavorites = response.data;
        });
    }
	
};