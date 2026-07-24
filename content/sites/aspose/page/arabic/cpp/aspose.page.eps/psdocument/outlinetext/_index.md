---
title: "Aspose::Page::EPS::PsDocument::OutlineText طريقة"
linktitle: "OutlineText"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::EPS::PsDocument::OutlineText طريقة. يضيف سلسلة نصية عن طريق رسم حدود الحروف في C++."
type: docs
weight: 3900
url: /ar/cpp/aspose.page.eps/psdocument/outlinetext/
---
## PsDocument::OutlineText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) method


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| text | System::String | النص المراد إضافته. |
| التقدمات | System::ArrayPtr\<float\> | مصفوفة لعرض الحروف. يجب أن يتطابق طولها مع عدد الحروف في السلسلة. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) التي سيتم استخدامها لرسم النص. يمكن استخدامها مع خط مخصص موجود في مجلد مخصص. |
| x | عدد عائم | الإحداثي X لأصل النص. |
| y | عدد عائم | الإحداثي Y لأصل النص. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::OutlineText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) method


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| text | System::String | النص المراد إضافته. |
| التقدمات | System::ArrayPtr\<float\> | مصفوفة لعرض الحروف. يجب أن يتطابق طولها مع عدد الحروف في السلسلة. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) التي سيتم استخدامها لرسم النص. يمكن استخدامها مع خط مخصص موجود في مجلد مخصص. |
| x | عدد عائم | الإحداثي X لأصل النص. |
| y | عدد عائم | الإحداثي Y لأصل النص. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | الخط المستخدم لرسم حدود الحروف. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::OutlineText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) method


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| text | System::String | النص المراد إضافته. |
| التقدمات | System::ArrayPtr\<float\> | مصفوفة لعرض الحروف. يجب أن يتطابق طولها مع عدد الحروف في السلسلة. |
| الخط | System::SharedPtr\<System::Drawing::Font\> | الخط الذي سيُستخدم لرسم النص. |
| x | عدد عائم | الإحداثي X لأصل النص. |
| y | عدد عائم | الإحداثي Y لأصل النص. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::OutlineText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) method


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| text | System::String | النص المراد إضافته. |
| التقدمات | System::ArrayPtr\<float\> | مصفوفة لعرض الحروف. يجب أن يتطابق طولها مع عدد الحروف في السلسلة. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) الخط الذي سيتم استخدامه لرسم النص. |
| x | عدد عائم | الإحداثي X لأصل النص. |
| y | عدد عائم | الإحداثي Y لأصل النص. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | الخط المستخدم لرسم حدود الحروف. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::OutlineText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) method


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| text | System::String | النص المراد إضافته. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) التي سيتم استخدامها لرسم النص. يمكن استخدامها مع خط مخصص موجود في مجلد مخصص. |
| x | عدد عائم | الإحداثي X لأصل النص. |
| y | عدد عائم | الإحداثي Y لأصل النص. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::OutlineText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) method


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| text | System::String | النص المراد إضافته. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) التي سيتم استخدامها لرسم النص. يمكن استخدامها مع خط مخصص موجود في مجلد مخصص. |
| x | عدد عائم | الإحداثي X لأصل النص. |
| y | عدد عائم | الإحداثي Y لأصل النص. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | الخط المستخدم لرسم حدود الحروف. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::OutlineText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) method


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| text | System::String | النص المراد إضافته. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) الخط الذي سيتم استخدامه لرسم النص. |
| x | عدد عائم | الإحداثي X لأصل النص. |
| y | عدد عائم | الإحداثي Y لأصل النص. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::OutlineText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) method


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| text | System::String | النص المراد إضافته. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) الخط الذي سيتم استخدامه لرسم النص. |
| x | عدد عائم | الإحداثي X لأصل النص. |
| y | عدد عائم | الإحداثي Y لأصل النص. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | الخط المستخدم لرسم حدود الحروف. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
