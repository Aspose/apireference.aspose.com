---
title: "System::MakeSharedPtr method"
linktitle: "MakeSharedPtr"
second_title: "C++용 Aspose.Page"
description: "System::MakeSharedPtr method. 원시 포인터를 스마트 포인터로 변환합니다. const 포인터에 대한 오버로드입니다. 예를 들어 C# 메서드가 C++에서 const로 변환될 때 ''this'' 변수를 사용할 때 유용합니다."
type: docs
weight: 24800
url: /ko/cpp/system/makesharedptr/
---
## System::MakeSharedPtr(const X *) method


원시 포인터를 스마트 포인터로 변환합니다. const 포인터에 대한 오버로드입니다. 예를 들어 C# 메서드가 const로 변환될 때 'this' 변수를 사용할 때 유용합니다.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(const X *p)
```


| 매개변수 | 설명 |
| --- | --- |
| X | 가리키는 객체 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| p | const X * | 객체에 대한 원시 포인터. |

### ReturnValue

객체에 대한 공유 스마트 포인터.

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeSharedPtr(X *) method


원시 포인터를 스마트 포인터로 변환합니다.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(X *p)
```


| 매개변수 | 설명 |
| --- | --- |
| X | 가리키는 객체 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| p | X * | 객체에 대한 원시 포인터. |

### ReturnValue

객체에 대한 공유 스마트 포인터.

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
