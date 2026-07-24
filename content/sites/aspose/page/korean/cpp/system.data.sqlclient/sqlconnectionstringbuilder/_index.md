---
title: "System::Data::SqlClient::SqlConnectionStringBuilder 클래스"
linktitle: "SqlConnectionStringBuilder"
second_title: "C++용 Aspose.Page"
description: "System::Data::SqlClient::SqlConnectionStringBuilder 클래스. SQL 기반 연결 빌더. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 100
url: /ko/cpp/system.data.sqlclient/sqlconnectionstringbuilder/
---
## SqlConnectionStringBuilder class


SQL 기반 연결 빌더. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인자로 전달할 때 해당 포인터를 사용하십시오.

```cpp
class SqlConnectionStringBuilder : public System::Data::Common::DbConnectionStringBuilder
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_DataSource](./get_datasource/)() const | 데이터 소스(예: 호스트 이름 및 포트)를 가져옵니다. |
| [get_Encrypt](./get_encrypt/)() const | 라인에서 암호화가 활성화되어 있는지 확인합니다. |
| [get_InitialCatalog](./get_initialcatalog/)() const | 연결과 연결된 데이터베이스 이름을 가져옵니다. |
| [get_NetworkLibrary](./get_networklibrary/)() const | 사용된 네트워크 라이브러리 이름을 가져옵니다. |
| [get_Password](./get_password/)() const | 데이터베이스 연결에 사용되는 비밀번호를 가져옵니다. |
| [get_TrustServerCertificate](./get_trustservercertificate/)() const | 연결이 신뢰 서버 인증서를 사용하여 보호되는지 확인합니다. |
| [get_UserID](./get_userid/)() const | 연결에 사용되는 사용자 ID를 가져옵니다. |
| [idx_get](./idx_get/)(String) override | RTTI 정보. |
| [idx_set](./idx_set/)(String, Object::ptr) override | 키가 지정된 객체를 설정합니다. |
| [set_DataSource](./set_datasource/)(const String\&) | 데이터 소스(예: 호스트 이름 및 포트)를 가져옵니다. |
| [set_Encrypt](./set_encrypt/)(bool) | 암호화를 켜거나 끕니다. |
| [set_InitialCatalog](./set_initialcatalog/)(const String\&) | 연결과 연결된 데이터베이스 이름을 설정합니다. |
| [set_NetworkLibrary](./set_networklibrary/)(const String\&) | 사용할 네트워크 라이브러리를 선택합니다. |
| [set_Password](./set_password/)(const String\&) | 데이터베이스에 연결하는 데 사용할 비밀번호를 설정합니다. |
| [set_TrustServerCertificate](./set_trustservercertificate/)(bool) | 연결이 신뢰 서버 인증서를 사용하여 보호되는지 여부를 결정합니다. |
| [set_UserID](./set_userid/)(const String\&) | 연결에 사용할 사용자 ID를 설정합니다. |
## 또 보기

* Class [DbConnectionStringBuilder](../../system.data.common/dbconnectionstringbuilder/)
* Namespace [System::Data::SqlClient](../)
* Library [Aspose.Page for C++](../../)
