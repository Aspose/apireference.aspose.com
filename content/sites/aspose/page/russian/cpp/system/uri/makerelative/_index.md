---
title: "Метод System::Uri::MakeRelative"
linktitle: "MakeRelative"
second_title: "Aspose.Page для C++"
description: "Метод System::Uri::MakeRelative. Определяет разницу между двумя экземплярами Uri в C++."
type: docs
weight: 3000
url: /ru/cpp/system/uri/makerelative/
---
## Uri::MakeRelative method


Определяет разницу между двумя экземплярами [Uri](../).

```cpp
String System::Uri::MakeRelative(const SharedPtr<Uri> &toUri)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| toUri | const SharedPtr\<Uri\>\& | URI, который сравнивается с текущим URI |

### ReturnValue

Если имя хоста и схема URI, представленных текущим объектом и **toUri**, одинаковы, то этот метод возвращает [String](../../string/), представляющий относительный [Uri](../), который при добавлении к текущему экземпляру URI дает **toUri**. Если имя хоста или схема различаются, то метод возвращает [String](../../string/), представляющий параметр **uri**.

## См. также

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
