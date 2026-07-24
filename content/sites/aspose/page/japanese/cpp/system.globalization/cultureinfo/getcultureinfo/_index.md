---
title: "System::Globalization::CultureInfo::GetCultureInfo メソッド"
linktitle: "GetCultureInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::CultureInfo::GetCultureInfo メソッド。名前でカルチャを取得します。C++ では CreateSpecificCulture と同等です。"
type: docs
weight: 4200
url: /ja/cpp/system.globalization/cultureinfo/getcultureinfo/
---
## CultureInfo::GetCultureInfo(const String\&) method


名前でカルチャーを取得します。CreateSpecificCulture と同じです。

```cpp
static CultureInfoPtr System::Globalization::CultureInfo::GetCultureInfo(const String &name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | const String\& | 事前定義されたカルチャ名または既存のカルチャオブジェクトの名前。 |

### ReturnValue

新しく作成されたカルチャオブジェクト。

## 参照

* Typedef [CultureInfoPtr](../../cultureinfoptr/)
* Class [String](../../../system/string/)
* Class [CultureInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CultureInfo::GetCultureInfo(const String\&, const String\&) method


名前でカルチャーを取得します。

```cpp
static CultureInfoPtr System::Globalization::CultureInfo::GetCultureInfo(const String &name, const String &text_and_compare_culture_name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | const String\& | カルチャ名。 |
| text_and_compare_culture_name | const String\& | カルチャ名は [TextInfo](../../textinfo/) および [CompareInfo](../../compareinfo/) オブジェクトで使用されます。 |

### ReturnValue

Culture オブジェクト。

## 参照

* Typedef [CultureInfoPtr](../../cultureinfoptr/)
* Class [String](../../../system/string/)
* Class [CultureInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CultureInfo::GetCultureInfo(int32_t) method


ID でカルチャーを取得します。

```cpp
static CultureInfoPtr System::Globalization::CultureInfo::GetCultureInfo(int32_t culture)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| カルチャ | int32_t | カルチャ識別子。 |

### ReturnValue

新しく作成されたカルチャオブジェクト。

## 参照

* Typedef [CultureInfoPtr](../../cultureinfoptr/)
* Class [CultureInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
