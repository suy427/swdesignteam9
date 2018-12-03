# Integrated Internship Application Program for KNU
--------------------------------------------------
  
  
## SW Design Team9
-----------------
- Kim hyun ji
- Son jong young
- Kim sun hee
- Lee yun min
-----------------


### Contents
------------
(1) 주관처 - 인턴프로그램 정보 관리
 - 주관처 : 국제교류처, 특정 학과, 산학협력처, 사업단 등
 - 각 주관처에서는 인턴 프로그램의  
	[모집기간, 회사명, 직무, 파견국가, 모집인원, 임금, 필요 자격요건]  
   에 대한 정보를 입력, 수정, 삭제할 수 있다.

(2) 학생 - 인턴모집 정보 조회
 - 학생은 모든 인턴십 프로그램을  
	[모집기간, 주관처, 회사, 모집최소학년, 모집직무, 파견국가, 파견기간, 경쟁률, 모집인원, 임금]  
   별로 필터링해 그 목록을 조회할 수 있다. 
 - 학생은 인턴십 프로그램 조회결과를 최근등록일 순, 마감임박 순으로 정렬할 수 있다.
 - 학생은 조회결과로 나온 프로그램들의 상세정보를 확인할 수 있다.
 - 모집직무 : 행정, 연구, 관리, 디자인, 번역, 개발, 사무, 기타
 - 파견국가 : 미국, 호주, 일본, 중국, 인도, 폴란드, 독일, 헝가리, 핀란드, 아일랜드

(3) 학생 - 내 정보기반 조회
 - 학생은 "자신이 원하는 인턴십 프로그램 모집조건"을 저장시켜둘수 있다.
 - 학생이 저장시켜둘 수 있는 모집조건에는  
	[모집기간, 주관처, 회사, 모집최소학년, 모집직무, 파견국가, 파견기간, 임금]  
   이 있다.
 - 학생은 저장시켜둔 조건을 이용해 한번에 인턴십 프로그램들을 필터링해 목록을 조회할 수 있다.
 - 학생은 "자신이 실제로 가지고 있는 자격요건"을 저장시켜둘 수 있다.
 - 학생이 저장시켜둘 수 있는 실제 자격요건에는  
  [학년, 학과, 영어실력, 학점]  
   이 있다.
 - 학생은 자신의 실제 자격요건으로 지원할 수 있는 인턴십 프로그램 목록을 조회할 수 있다.
 - 학생은 조회결과로 나온 프로그램들의 상세정보를 확인할 수 있다.
 ------------
  
  
#### Documents
--------------
 - Requirements(reports)
 - usecaseDiagram
 - activityDiagram
 - sequenceDiagram
 - classDiagram(packageDiagram)
 --------------


#### Packages
-------------
 - UI Layer
 - DataManagement Layer
 - ProblemDomain Layer
	- User package
	- User.Student package
	- Apply package
	- Internship package
-------------
  
#### Classes
------------
 - User package : User Office
 - User.Student package : Student ExtraQualification
 - Apply package : Apply PersonalApplyData
 - Internship package : InternshipProgram ProgramRequirement ExtraRequirement ProgramInformation Period SearchFilter
 (+) 삭제필요 : wishCondition ApplyData
------------
