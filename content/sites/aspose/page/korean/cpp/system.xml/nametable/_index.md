---
title: "System::Xml::NameTable 클래스"
linktitle: "NameTable"
second_title: "C++용 Aspose.Page"
description: "System::Xml::NameTable 클래스. C++에서 단일 스레드 XmlNameTable을 구현합니다."
type: docs
weight: 500
url: /ko/cpp/system.xml/nametable/
---
## NameTable class


단일 스레드 [XmlNameTable](../xmlnametable/)을 구현합니다.

```cpp
class NameTable : public System::Xml::XmlNameTable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const String\&) override | 지정된 문자열을 원자화하고 이를 [NameTable](./)에 추가합니다. |
| [Add](./add/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | 지정된 문자열을 원자화하고 이를 [NameTable](./)에 추가합니다. |
| [Get](./get/)(const String\&) override | 지정된 값을 가진 원자화된 문자열을 반환합니다. |
| [Get](./get/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | 지정된 배열에서 지정된 문자 범위와 동일한 문자를 포함하는 원자화된 문자열을 반환합니다. |
| [NameTable](./nametable/)() | [NameTable](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlNameTable](../xmlnametable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
