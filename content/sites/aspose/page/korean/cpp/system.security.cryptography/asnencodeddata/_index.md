---
title: "System::Security::Cryptography::AsnEncodedData class"
linktitle: "AsnEncodedData"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::AsnEncodedData 클래스. ASN.1 인코딩 데이터. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 100
url: /ko/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


ASN.1 인코딩 데이터. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class AsnEncodedData : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI 정보. |
| [AsnEncodedData](./asnencodeddata/)(const ByteArrayPtr\&) | 생성자. |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&) | 생성자. |
| [AsnEncodedData](./asnencodeddata/)(const String\&, const ByteArrayPtr\&) | 생성자. |
| virtual [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) | 다른 객체에서 데이터를 복사합니다. |
| virtual [Format](./format/)(bool) const | 데이터를 사람이 읽기 쉬운 형태로 포맷합니다. |
| [get_Oid](./get_oid/)() const | 인코딩된 데이터의 객체 식별자를 가져옵니다. |
| [get_RawData](./get_rawdata/)() const | 원시 인코딩 데이터를 가져옵니다. |
| [set_Oid](./set_oid/)(const SharedPtr\<Oid\>\&) | 인코딩된 데이터의 객체 식별자를 설정합니다. |
| [set_RawData](./set_rawdata/)(const ByteArrayPtr\&) | 원시 인코딩 데이터를 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
