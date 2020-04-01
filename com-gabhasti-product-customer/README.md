Rune with environemnt argurmant in RUN as 
spring.profiles.active = derby    >> in resources check there is a application-derby.properties file 
Request: localhost:8081/api/opportunity/
GET  

Request: localhost:8081/api/opportunity
POST
BODY : Type : application/json
[{
	
	"companyName":"dir3",
	"typeCompany" :"PPL", 
	"address":"676 Dsilva wadi",
	"state" :"Maharashtra",
	"pincode" :"401207",
	"cin": "CIN", 
	"pan" :"PAN", 
	"gstNo": "GST_NO", 
	"cersai":"CERSAI", 
	"cibilScore" :"CIBIL_SCORE",
	
	"emailId" :"dir3@gmail", 
	"currentBusinessValue": 1,  
	"mobileNo": "8452951",
	"officeLandlineNo"  :"",
	
	"makerId" :"MAKER_ID",
	"cepOpportunityDir":[{
	"directorName" :"DIRECTOR_NAME",    
	"panNo": "PAN_NO", 
	"aadharId":"AADHAR_ID", 
	"voterId":"VOTER_ID", 
	"passportNo" :"PASSPORT_NO",
	"cibilScore": "CIBIL_SCORE",
	"mobileNo" :"54515",
	"email":"dir3@gmail.com",
	"makerId" :"MAKER_ID" 
	
		
	}]


	
},
{
	
	"companyName":"dir4",
	"typeCompany" :"PPL", 
	"address":"676 Dsilva wadi",
	"state" :"Maharashtra",
	"pincode" :"401207",
	"cin": "CIN", 
	"pan" :"PAN", 
	"gstNo": "GST_NO", 
	"cersai":"CERSAI", 
	"cibilScore" :"CIBIL_SCORE",
	
	"emailId" :"dir4@gmail.com", 
	"currentBusinessValue": 1,  
	"mobileNo": "8452951",
	"officeLandlineNo"  :"",
	
	"makerId" :"MAKER_ID",
	"cepOpportunityDir":[{
	 
	"directorName" :"DIRECTOR_NAME",    
	"panNo": "PAN_NO", 
	"aadharId":"AADHAR_ID", 
	"voterId":"VOTER_ID", 
	"passportNo" :"PASSPORT_NO",
	"cibilScore": "CIBIL_SCORE",
	"mobileNo" :"54515",
	"email":"dir4@gmail",
	"makerId" :"MAKER_ID" 
	
		
	}]


	
}
]