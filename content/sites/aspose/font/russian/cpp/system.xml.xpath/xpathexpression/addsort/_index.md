---
title: "Метод System::Xml::XPath::XPathExpression::AddSort"
linktitle: "AddSort"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XPath::XPathExpression::AddSort. При переопределении в производном классе сортирует узлы, выбранные XPath‑выражением, в соответствии с указанным объектом IComparer в C++."
type: docs
weight: 100
url: /ru/cpp/system.xml.xpath/xpathexpression/addsort/
---
## XPathExpression::AddSort(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) method


При переопределении в производном классе сортирует узлы, выбранные [XPath](../../)‑выражением, в соответствии с указанным объектом IComparer.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, SharedPtr<Collections::Generic::IComparer<SharedPtr<Object>>> comparer)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Объект, представляющий ключ сортировки. Это может быть **string**‑значение узла или объект [XPathExpression](../) с скомпилированным [XPath](../../)‑выражением. |
| comparer | SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\> | Объект IComparer, предоставляющий сравнения конкретных типов данных для сравнения двух объектов на эквивалентность. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathExpression::AddSort(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) method


При переопределении в производном классе сортирует узлы, выбранные [XPath](../../)‑выражением, в соответствии с переданными параметрами.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, XmlSortOrder order, XmlCaseOrder caseOrder, String lang, XmlDataType dataType)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Объект, представляющий ключ сортировки. Это может быть **string**‑значение узла или объект [XPathExpression](../) с скомпилированным [XPath](../../)‑выражением. |
| order | XmlSortOrder | Значение [XmlSortOrder](../../xmlsortorder/), указывающее порядок сортировки. |
| caseOrder | XmlCaseOrder | Значение [XmlCaseOrder](../../xmlcaseorder/), указывающее способ сортировки заглавных и строчных букв. |
| lang | String | Язык, используемый для сравнения. Используется класс [Globalization::CultureInfo](../../../system.globalization/cultureinfo/), который можно передать методу [String::Compare](../../../system/string/compare/) для указания типа языка, например, "us-en" для американского английского. Если указана пустая строка, язык определяется из системной среды с помощью [Globalization::CultureInfo](../../../system.globalization/cultureinfo/). |
| dataType | XmlDataType | Значение [XmlDataType](../../xmldatatype/), указывающее порядок сортировки для типа данных. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [XmlSortOrder](../../xmlsortorder/)
* Enum [XmlCaseOrder](../../xmlcaseorder/)
* Class [String](../../../system/string/)
* Enum [XmlDataType](../../xmldatatype/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
