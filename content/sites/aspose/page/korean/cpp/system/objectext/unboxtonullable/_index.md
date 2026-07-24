---
title: "System::ObjectExt::UnboxToNullable method"
linktitle: "UnboxToNullable"
second_title: "C++용 Aspose.Page"
description: "System::ObjectExt::UnboxToNullable 메서드. C++에서 객체를 nullable 타입으로 언박싱합니다."
type: docs
weight: 1600
url: /ko/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


객체를 nullable 유형으로 언박싱합니다.

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/)를 언박스합니다. |
| 안전 | bool | true이면 실패 시 nullptr를 반환하고, 그렇지 않으면 InvalidCastException을 발생시킵니다. |

### ReturnValue

언박싱된 nullable 값 (null일 수 있음).

## 또 보기

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
