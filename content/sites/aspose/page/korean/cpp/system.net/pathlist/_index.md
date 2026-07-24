---
title: "System::Net::PathList 클래스"
linktitle: "PathList"
second_title: "C++용 Aspose.Page"
description: "System::Net::PathList 클래스. CookieCollection 클래스 인스턴스들의 목록을 나타냅니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 3000
url: /ko/cpp/system.net/pathlist/
---
## PathList class


[CookieCollection](../cookiecollection/) 클래스 인스턴스들의 목록을 나타냅니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class PathList : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Create](./create/)() | 새 인스턴스를 생성합니다. |
| [get_Count](./get_count/)() const | 항목 수를 반환합니다. |
| [get_SyncRoot](./get_syncroot/)() const | 컬렉션이 동기화되는 객체를 반환합니다. |
| [GetCookiesCount](./getcookiescount/)() | 모든 컬렉션 항목의 쿠키 수를 반환합니다. |
| [GetEnumerator](./getenumerator/)() | 현재 컬렉션에 대한 열거자를 반환합니다. |
| [idx_get](./idx_get/)(String) | 지정된 경로에 따라 쿠키 컬렉션을 가져옵니다. |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | 지정된 경로에 따라 쿠키 컬렉션을 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
