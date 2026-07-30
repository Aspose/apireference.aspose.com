---
title: "Aspose::Font::Font::Open method"
linktitle: "Open"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::Font::Open method. يفتح خطًا باستخدام نوع الخط ومصفوفة بايتات بيانات الخط في C++."
type: docs
weight: 2400
url: /ar/cpp/aspose.font/font/open/
---
## Font::Open(Aspose::Font::FontType, System::ArrayPtr\<uint8_t\>) method


يفتح خطًا باستخدام نوع الخط ومصفوفة بايتات بيانات الخط.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(Aspose::Font::FontType fontType, System::ArrayPtr<uint8_t> fontData)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | Aspose::Font::FontType | نوع [Font](../). |
| fontData | System::ArrayPtr\<uint8_t\> | مصفوفة بايتات لتحميل الخط منها. |

### ReturnValue

[Font](../) loaded.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontType](../../fonttype/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Open(Aspose::Font::FontType, System::SharedPtr\<Sources::StreamSource\>) method


يفتح خطًا باستخدام نوع الخط ومصدر الدفق.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(Aspose::Font::FontType fontType, System::SharedPtr<Sources::StreamSource> fontStreamSource)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | Aspose::Font::FontType | نوع [Font](../). |
| fontStreamSource | System::SharedPtr\<Sources::StreamSource\> | مصدر الدفق للخط. |

### ReturnValue

[Font](../) loaded.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontType](../../fonttype/)
* Class [StreamSource](../../../aspose.font.sources/streamsource/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Open(Aspose::Font::FontType, System::String) method


يفتح خطًا باستخدام نوع الخط واسم ملف الخط.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(Aspose::Font::FontType fontType, System::String fileName)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | Aspose::Font::FontType | نوع [Font](../). |
| fileName | System::String | اسم ملف [Font](../). |

### ReturnValue

[Font](../) loaded.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontType](../../fonttype/)
* Class [String](../../../system/string/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Open(System::SharedPtr\<Aspose::Font::Sources::FontDefinition\>) method


يفتح خطًا باستخدام كائن FontDefinition.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(System::SharedPtr<Aspose::Font::Sources::FontDefinition> fontDefinition)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| fontDefinition | System::SharedPtr\<Aspose::Font::Sources::FontDefinition\> | كائن تعريف [Font](../). |

### ReturnValue

[Font](../) loaded.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Class [FontDefinition](../../../aspose.font.sources/fontdefinition/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
