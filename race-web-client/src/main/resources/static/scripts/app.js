(function(){
    angular.module("raceApp", [
        "ngAnimate",
        "ngCookies",
        "ngResource",
        "ngRoute",
        "ngSanitize",
        "ngTouch"
    ])
    .config(["$routeProvider", function($routeProvider){
        $routeProvider
            .when("/", {
                templateUrl: "views/main.html",
                controller: "MainCtrl"
            })
            .otherwise({
                redirectTo: "/"
            });
    }]);
})();
