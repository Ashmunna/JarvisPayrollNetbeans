var app = angular.module("app", ["ngRoute"]);
app.config(function ($routeProvider) {
    $routeProvider
            .when("/", {
                templateUrl: "views/body.html"
            })
            .when("/about", {
                templateUrl: "views/about.html"
            })
            .when("/employee_registration", {
                controller: 'employeeController',
                templateUrl: "views/employee_registration.html"
            })
            .when("/admin", {
                templateUrl: "views/admin.html"
            })
            .when("/user", {
                templateUrl: "views/user.html"
            })
            .when("/contact", {
                controller: 'contactCtrl',
                templateUrl: "views/contact.html"
            }).otherwise({redirectTo: '/'});
});


app.controller('employeeController', function($scope, $http){
	
	$scope.empobj = {
			
			first_name: '',
			surname: '',
			dob: '',
			gender: '',
			email: '',
			contact_no: '',
			address: '',
			department: '',
			designation: '',
			status: '',
			doh: '',
			basic_salary: '',
                        username: '',
                        password:''
			
	};
	
	$scope.onEmpSubmit = function(){
		
		//alert('Okay')
		
		const data = JSON.stringify(this.empobj);
                console.log(data);
		$http.post('/saveemployee', data)
		.then(function(res){
			console.log(res);
		}).catch(function(err){
			
		});
	};
	
});

 

app.controller('contactCtrl', function ($scope, $rootScope, $location, $http) {
    
    $scope.cobj = {
		
                id: '',
                name: '',
                email: '',
                subject: '',
                message: ''
                
			
	};
	
	$scope.onContactSubmit = function(){
		
		//alert('Okay')
		
		const cdata = JSON.stringify(this.cobj);
                console.log(cdata);
		$http.post('/savecontact', cdata)
		.then(function(res){
			console.log(res);
		}).catch(function(err){
			
		});
	};
                 
});