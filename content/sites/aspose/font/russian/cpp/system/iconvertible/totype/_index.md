---
title: "System::IConvertible::ToType метод"
linktitle: "ToType"
second_title: "Aspose.Font для C++"
description: "System::IConvertible::ToType метод. Преобразует значение этого экземпляра в System::Object указанного System::Type, имеющего эквивалентное значение, используя указанные сведения о форматировании, зависящие от культуры, в C++."
type: docs
weight: 1400
url: /ru/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


Преобразует значение этого экземпляра в [System::Object](../../object/) указанного System::Type, имеющего эквивалентное значение, используя указанные сведения о форматировании, зависящие от культуры.

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| conversionType | const TypeInfo\& | System::Type, в который преобразуется значение этого экземпляра. |
| provider | System::SharedPtr\<System::IFormatProvider\> | Реализация интерфейса [System::IFormatProvider](../../iformatprovider/), предоставляющая сведения о форматировании, зависящие от культуры. |

### ReturnValue

Экземпляр [System::Object](../../object/) типа conversionType, значение которого эквивалентно значению этого экземпляра.

## См. также

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
