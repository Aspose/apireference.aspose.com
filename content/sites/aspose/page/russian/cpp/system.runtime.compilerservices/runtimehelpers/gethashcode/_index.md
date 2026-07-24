---
title: "System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode метод"
linktitle: "GetHashCode"
second_title: "Aspose.Page для C++"
description: "System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode метод. Получает хеш-код для произвольного типа. Вызывает Object::GetHashCode() для этого в C++."
type: docs
weight: 100
url: /ru/cpp/system.runtime.compilerservices/runtimehelpers/gethashcode/
---
## RuntimeHelpers::GetHashCode method


Получает хеш-код для произвольного типа. Вызывает [Object::GetHashCode()](../../../system/object/gethashcode/) для этого.

```cpp
template<typename T> static int System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode(SmartPtr<T> const &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Тип, для которого получаем хеш-код. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | SmartPtr\<T\> const\& | [Object](../../../system/object/) для получения информации. |

### ReturnValue

Значение хеш-кода, вычисленное целевой реализацией.

## См. также

* Class [SmartPtr](../../../system/smartptr/)
* Class [RuntimeHelpers](../)
* Namespace [System::Runtime::CompilerServices](../../)
* Library [Aspose.Page for C++](../../../)
