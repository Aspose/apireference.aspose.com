---
title: "طريقة System::Drawing::Graphics::MeasureString"
linktitle: "MeasureString"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Drawing::Graphics::MeasureString. تُرجع حجم السلسلة المحددة عند رسمها بالخط المحدد وبالصيغة المحددة في C++."
type: docs
weight: 6500
url: /ar/cpp/system.drawing/graphics/measurestring/
---
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const method


يعيد حجم السلسلة المحددة عند رسمها بالخط المحدد وبالتنسيق المحدد.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, int width, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | String const\& | السلسلة التي يُراد حساب حجمها |
| الخط | System::SharedPtr\<Font\> const\& | الخط المستخدم لرسم السلسلة |
| العرض | int | العرض الأقصى للسلسلة |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | يحدد تنسيق السلسلة |

### ReturnValue

كائن [SizeF](../../sizef/) يمثل حجم السلسلة بوحدات القياس المحددة بواسطة خاصية PageUnit لكائن Graphics الحالي.

## انظر أيضًا

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const method


يعيد حجم السلسلة المحددة عند رسمها بالخط المحدد وبالتنسيق المحدد.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, PointF const &origin=PointF(0, 0), System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | String const\& | السلسلة التي يُراد حساب حجمها |
| الخط | System::SharedPtr\<Font\> const\& | الخط المستخدم لرسم السلسلة |
| origin | PointF const\& | يحدد موقع الزاوية العلوية اليسرى للسلسلة |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | يحدد تنسيق السلسلة |

### ReturnValue

كائن [SizeF](../../sizef/) يمثل حجم السلسلة بوحدات القياس المحددة بواسطة خاصية PageUnit لكائن Graphics الحالي.

## انظر أيضًا

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const method


غير مُنفَّذ.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat, int &charactersFitted, int &linesFilled) const
```


## انظر أيضًا

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const method


يعيد حجم السلسلة المحددة عند رسمها بالخط المحدد وبالتنسيق المحدد.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | String const\& | السلسلة التي يُراد حساب حجمها |
| الخط | System::SharedPtr\<Font\> const\& | الخط المستخدم لرسم السلسلة |
| layoutArea | SizeF const\& | مساحة التخطيط القصوى للسلسلة |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | يحدد تنسيق السلسلة |

### ReturnValue

كائن [SizeF](../../sizef/) يمثل حجم السلسلة بوحدات القياس المحددة بواسطة خاصية PageUnit لكائن Graphics الحالي.

## انظر أيضًا

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
