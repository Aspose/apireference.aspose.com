---
title: "منشئ System::Drawing::Font::Font"
linktitle: "خط"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::Drawing::Font::Font. يُنشئ نسخة جديدة من فئة Font التي تمثل الخط الموجود المحدد مع نمط الخط المحدد في C++."
type: docs
weight: 100
url: /ar/cpp/system.drawing/font/font/
---
## Font::Font(const SharedPtr\<Font\>\&, FontStyle) constructor


يُنشئ نسخة جديدة من فئة [Font](../) التي تمثل الخط الموجود المحدد مع نمط الخط المحدد.

```cpp
System::Drawing::Font::Font(const SharedPtr<Font> &prototype, FontStyle new_style)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نموذج | const SharedPtr\<Font\>\& | الخط الموجود لإنشاء الخط الجديد منه |
| new_style | FontStyle | نمط خط لتطبيقه على الخط الجديد |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontStyle](../../fontstyle/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


يُنشئ نسخة جديدة من فئة [Font](../).

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| العائلة | const SharedPtr\<FontFamily\>\& | عائلة الخط للخط الجديد |
| em_size | float | حجم الـ em للخط الجديد بالوحدات المحددة بواسطة المعامل **unit** |
| النمط | FontStyle | نمط الخط الجديد |
| unit | GraphicsUnit | وحدات القياس للخط الجديد |
| gdi_charset | uint8_t | مجموعة أحرف GDI تُستخدم للخط الجديد |
| gdi_vertical_font | bool | صحيح إذا كان الخط الجديد مشتقًا من خط عمودي GDI |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) constructor


يُنشئ نسخة جديدة من فئة [Font](../).

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| العائلة | const SharedPtr\<FontFamily\>\& | عائلة الخط للخط الجديد |
| em_size | float | حجم الـ em للخط الجديد بالوحدات المحددة بواسطة المعامل **unit** |
| unit | GraphicsUnit | وحدات القياس للخط الجديد |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Font(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


يُنشئ نسخة جديدة من فئة [Font](../).

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| family_name | const String\& | اسم عائلة الخط للخط الجديد |
| em_size | float | حجم الـ em للخط الجديد بالوحدات المحددة بواسطة المعامل **unit** |
| النمط | FontStyle | نمط الخط الجديد |
| unit | GraphicsUnit | وحدات القياس للخط الجديد |
| gdi_charset | uint8_t | مجموعة أحرف GDI تُستخدم للخط الجديد |
| gdi_vertical_font | bool | صحيح إذا كان الخط الجديد مشتقًا من خط عمودي GDI |

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Font(const String\&, float, GraphicsUnit) constructor


يُنشئ نسخة جديدة من فئة [Font](../).

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| family_name | const String\& | اسم عائلة الخط للخط الجديد |
| em_size | float | حجم الـ em للخط الجديد بالوحدات المحددة بواسطة المعامل **unit** |
| unit | GraphicsUnit | وحدات القياس للخط الجديد |

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
