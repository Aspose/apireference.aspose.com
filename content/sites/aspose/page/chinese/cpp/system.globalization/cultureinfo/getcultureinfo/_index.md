---
title: "System::Globalization::CultureInfo::GetCultureInfo 方法"
linktitle: "GetCultureInfo"
second_title: "Aspose.Page 适用于 C++"
description: "System::Globalization::CultureInfo::GetCultureInfo method. 根据名称获取文化。与 C++ 中的 CreateSpecificCulture 相同。"
type: docs
weight: 4200
url: /zh/cpp/system.globalization/cultureinfo/getcultureinfo/
---
## CultureInfo::GetCultureInfo(const String\&) method


通过名称获取 culture。与 CreateSpecificCulture 相同。

```cpp
static CultureInfoPtr System::Globalization::CultureInfo::GetCultureInfo(const String &name)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | const String\& | 预定义的文化名称或现有文化对象的名称。 |

### ReturnValue

新创建的文化对象。

## 另见

* Typedef [CultureInfoPtr](../../cultureinfoptr/)
* Class [String](../../../system/string/)
* Class [CultureInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CultureInfo::GetCultureInfo(const String\&, const String\&) method


通过名称获取 culture。

```cpp
static CultureInfoPtr System::Globalization::CultureInfo::GetCultureInfo(const String &name, const String &text_and_compare_culture_name)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | const String\& | 文化名称。 |
| text_and_compare_culture_name | const String\& | 用于 [TextInfo](../../textinfo/) 和 [CompareInfo](../../compareinfo/) 对象的文化名称。 |

### ReturnValue

Culture 对象。

## 另见

* Typedef [CultureInfoPtr](../../cultureinfoptr/)
* Class [String](../../../system/string/)
* Class [CultureInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CultureInfo::GetCultureInfo(int32_t) method


通过 id 获取 culture。

```cpp
static CultureInfoPtr System::Globalization::CultureInfo::GetCultureInfo(int32_t culture)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 区域性 | int32_t | 区域标识符。 |

### ReturnValue

新创建的文化对象。

## 另见

* Typedef [CultureInfoPtr](../../cultureinfoptr/)
* Class [CultureInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
