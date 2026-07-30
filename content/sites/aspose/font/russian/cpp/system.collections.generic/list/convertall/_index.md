---
title: "System::Collections::Generic::List::ConvertAll метод"
linktitle: "ConvertAll"
second_title: "Aspose.Font для C++"
description: "System::Collections::Generic::List::ConvertAll метод. Создаёт список элементов, преобразованных в другой тип, в C++."
type: docs
weight: 1300
url: /ru/cpp/system.collections.generic/list/convertall/
---
## List::ConvertAll method


Создаёт список элементов, преобразованных в другой тип.

```cpp
template<typename OutputType> SharedPtr<List<OutputType>> System::Collections::Generic::List<T>::ConvertAll(Converter<T, OutputType> converter)
```


| Параметр | Описание |
| --- | --- |
| OutputType | Тип элемента выходного списка. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| converter | Converter\<T, OutputType\> | [Converter](../../../system/converter/) для использования при преобразовании элементов. |

### ReturnValue

Новосозданный список преобразованных элементов.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../)
* Typedef [Converter](../../../system/converter/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
