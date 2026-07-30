---
title: "طريقة System::Xml::XPath::XPathExpression::AddSort"
linktitle: "AddSort"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XPath::XPathExpression::AddSort. عند تجاوزها في فئة مشتقة، تقوم بترتيب العقد المحددة بواسطة تعبير XPath وفقًا لكائن IComparer المحدد في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml.xpath/xpathexpression/addsort/
---
## XPathExpression::AddSort(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) method


عند تجاوزها في فئة مشتقة، تقوم بترتيب العقد المحددة بواسطة تعبير [XPath](../../) وفقًا لكائن IComparer المحدد.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, SharedPtr<Collections::Generic::IComparer<SharedPtr<Object>>> comparer)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | كائن يمثل مفتاح الفرز. يمكن أن يكون قيمة **string** للعقدة أو كائن [XPathExpression](../) مع تعبير [XPath](../../) مُجمّع. |
| مقارن | SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\> | كائن IComparer يوفر مقارنات نوع البيانات المحددة لمقارنة كائنين للتكافؤ. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathExpression::AddSort(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) method


عند تجاوزها في فئة مشتقة، تقوم بترتيب العقد المحددة بواسطة تعبير [XPath](../../) وفقًا للمعلمات المقدمة.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, XmlSortOrder order, XmlCaseOrder caseOrder, String lang, XmlDataType dataType)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | كائن يمثل مفتاح الفرز. يمكن أن يكون قيمة **string** للعقدة أو كائن [XPathExpression](../) مع تعبير [XPath](../../) مُجمّع. |
| order | XmlSortOrder | قيمة [XmlSortOrder](../../xmlsortorder/) تشير إلى ترتيب الفرز. |
| caseOrder | XmlCaseOrder | قيمة [XmlCaseOrder](../../xmlcaseorder/) تشير إلى كيفية فرز الأحرف الكبيرة والصغيرة. |
| lang | String | اللغة المستخدمة للمقارنة. يستخدم الفئة [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) التي يمكن تمريرها إلى طريقة [String::Compare](../../../system/string/compare/) لأنواع اللغة، على سبيل المثال، "us-en" للإنجليزية الأمريكية. إذا تم تحديد سلسلة فارغة، يتم استخدام بيئة النظام لتحديد [Globalization::CultureInfo](../../../system.globalization/cultureinfo/). |
| dataType | XmlDataType | قيمة [XmlDataType](../../xmldatatype/) تشير إلى ترتيب الفرز لنوع البيانات. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [XmlSortOrder](../../xmlsortorder/)
* Enum [XmlCaseOrder](../../xmlcaseorder/)
* Class [String](../../../system/string/)
* Enum [XmlDataType](../../xmldatatype/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
