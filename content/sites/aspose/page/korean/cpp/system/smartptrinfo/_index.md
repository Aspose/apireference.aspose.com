---
title: "System::SmartPtrInfo class"
linktitle: "SmartPtrInfo"
second_title: "C++용 Aspose.Page"
description: "System::SmartPtrInfo class. 최종 타입을 알지 못한 상태에서 SmartPtr의 내용을 테스트하고 변경하기 위한 서비스 클래스입니다. 가비지 컬렉션 및 순환 참조 탐지 등에 사용됩니다. ''포인터 투 포인터''로 생각하면 됩니다. SmartPtr의 기본 타입이 없기 때문에 사용할 수 없으며, 대신 C++에서 이 ''info'' 클래스를 사용합니다."
type: docs
weight: 5600
url: /ko/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


최종 타입을 알지 못한 상태에서 [SmartPtr](../smartptr/)'의 내용을 테스트하고 변경하기 위한 서비스 클래스입니다. 가비지 컬렉션 및 순환 참조 탐지 등에 사용됩니다. '포인터 투 포인터'로 생각하면 됩니다. [SmartPtr](../smartptr/)'의 기본 타입이 없기 때문에 사용할 수 없으며, 대신 이 'info' 클래스를 사용합니다.

```cpp
class SmartPtrInfo
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | 참조된 포인터가 가리키는 원시 객체를 가져옵니다. |
| [getObject](./getobject/)() const | 참조된 포인터가 가리키는 객체를 가져옵니다. |
| [getOwned](./getowned/)() const | 소유된 객체 포인터를 가져옵니다. |
| [operator bool](./operatorbool/)() const | info 객체가 null이 아닌 포인터를 가리키는지 확인합니다. |
| [operator!](./operator!/)() const | info 객체가 null이 아닌 포인터를 가리키지 않는지 확인합니다. |
| [operator->](./operator-_/)() const | 참조된 포인터가 가리키는 [Object](../object/)의 메서드를 호출할 수 있게 합니다. |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | 두 info 객체가 참조하는 포인터 값들을 덜 비교합니다. |
| [SmartPtrInfo](./smartptrinfo/)() | 빈 [SmartPtrInfo](./) 객체를 생성합니다. |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | 특정 스마트 포인터에 대한 정보를 포함한 [SmartPtrInfo](./) 객체를 생성합니다. |
## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
