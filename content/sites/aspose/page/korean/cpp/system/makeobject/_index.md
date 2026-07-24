---
title: "System::MakeObject method"
linktitle: "MakeObject"
second_title: "C++용 Aspose.Page"
description: "System::MakeObject method. C++에서 힙에 객체를 생성하고 그에 대한 shared pointer를 반환합니다."
type: docs
weight: 24500
url: /ko/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


힙에 객체를 생성하고 그에 대한 shared pointer를 반환합니다.

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 인스턴스화할 클래스. |
| 인수 | 생성자 인수의 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| args | Args\&&... | 생성자 인수. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeObject(Args\&&...) method


힙에 객체를 생성하고 그에 대한 shared pointer를 반환합니다.

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [SmartPtr](../smartptr/) 인스턴스화할 클래스. |
| 인수 | 생성자 인수의 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| args | Args\&&... | 생성자 인수. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
