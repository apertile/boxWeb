angular.module('boxApp').factory('citySearchService', function ($http, $log, $q) {

	var service = {
        getCityLike: getCityLike
    };

    return service;
    
    function deferAction(p) {
        var d = $q.defer();
        p.then(function (result) {
            $log.debug(result.data);
            d.resolve(result);
        }, function (err) {
            $log.error(err);
            d.reject(err);
        });
        return d.promise;
    }
    
    function getCityLike(like) {
        var uri = '';
        uri += 'http://localhost:8080/boxWeb/cities?like=';
        uri += like;
        return deferAction($http({ url: uri, method: "GET" } ) );
    }
});