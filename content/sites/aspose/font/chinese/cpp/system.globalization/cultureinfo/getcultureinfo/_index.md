---
title: "System::Globalization::CultureInfo::GetCultureInfo 方法"
linktitle: "GetCultureInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::CultureInfo::GetCultureInfo 方法。通过名称获取区域性。相当于 C++ 中的 CreateSpecificCulture。"
type: docs
weight: 4200
url: /zh/cpp/system.globalization/cultureinfo/getcultureinfo/
---
## CultureInfo::GetCultureInfo(const String\&) method


通过名称获取区域性。等同于 CreateSpecificCulture。

```cpp
static CultureInfoPtr System::Globalization::CultureInfo::GetCultureInfo(const String &name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | const String\& | 预定义的区域性名称或现有区域性对象的名称。 |

### ReturnValue

新创建的区域性对象。

## 另见

* Typedef [CultureInfoPtr](../../cultureinfoptr/)
* Class [String](../../../system/string/)
* Class [CultureInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CultureInfo::GetCultureInfo(const String\&, const String\&) method


通过名称获取区域性。

```cpp
static CultureInfoPtr System::Globalization::CultureInfo::GetCultureInfo(const String &name, const String &text_and_compare_culture_name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | const String\& | 文化名称。 |
| text_and_compare_culture_name | const String\& | 用于 [TextInfo](../../textinfo/) 和 [CompareInfo](../../compareinfo/) 对象的区域性名称。 |

### ReturnValue

区域对象。

## 另见

* Typedef [CultureInfoPtr](../../cultureinfoptr/)
* Class [String](../../../system/string/)
* Class [CultureInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CultureInfo::GetCultureInfo(int32_t) method


通过 ID 获取区域性。

```cpp
static CultureInfoPtr System::Globalization::CultureInfo::GetCultureInfo(int32_t culture)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文化 | int32_t | 区域标识符。 |

### ReturnValue

新创建的区域性对象。

## 另见

* Typedef [CultureInfoPtr](../../cultureinfoptr/)
* Class [CultureInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
