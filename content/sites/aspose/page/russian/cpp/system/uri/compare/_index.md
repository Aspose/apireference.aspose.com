---
title: "System::Uri::Compare метод"
linktitle: "Compare"
second_title: "Aspose.Page для C++"
description: "System::Uri::Compare метод. Сравнивает указанные объекты Uri, используя заданные правила сравнения, в C++."
type: docs
weight: 3500
url: /ru/cpp/system/uri/compare/
---
## Uri::Compare method


Сравнивает указанные объекты [Uri](../), используя заданные правила сравнения.

```cpp
static int32_t System::Uri::Compare(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | Первый операнд сравнения |
| uri2 | const SharedPtr\<Uri\>\& | Второй операнд сравнения |
| partsToCompare | UriComponents | Указывает части **uri1** и **uri2**, которые следует сравнить |
| compareFormat | UriFormat | Указывает экранирование символов, используемое при сравнении компонентов URI |
| comparisonType | StringComparison | Одно из значений [StringComparison](../../stringcomparison/) |

### ReturnValue

Отрицательное значение, если **uri1** меньше **uri2**; 0, если uri1 и uri2 равны; положительное значение, если **uri1** больше **uri2**

## См. также

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Enum [UriComponents](../../uricomponents/)
* Enum [UriFormat](../../uriformat/)
* Enum [StringComparison](../../stringcomparison/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
