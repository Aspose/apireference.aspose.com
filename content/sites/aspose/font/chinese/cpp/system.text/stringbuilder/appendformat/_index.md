---
title: "System::Text::StringBuilder::AppendFormat 方法"
linktitle: "AppendFormat"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::StringBuilder::AppendFormat 方法。将格式化的字符串追加到 C++ 中的构建器。"
type: docs
weight: 400
url: /zh/cpp/system.text/stringbuilder/appendformat/
---
## StringBuilder::AppendFormat(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) method


向构建器追加格式化字符串。

```cpp
template<class...> StringBuilder * System::Text::StringBuilder::AppendFormat(const SharedPtr<IFormatProvider> &fp, const String &format, const TArgs &... args)
```


| 参数 | 描述 |
| --- | --- |
| TArgs | 参数类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fp | const SharedPtr\<IFormatProvider\>\& | 格式提供程序；已忽略。 |
| 格式 | const String\& | 格式字符串。 |
| args | const TArgs\&... | 要插入到格式字符串位置的参数。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFormatProvider](../../../system/iformatprovider/)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::AppendFormat(const String\&, const TArgs\&...) method


向构建器追加格式化字符串。

```cpp
template<class...> StringBuilder * System::Text::StringBuilder::AppendFormat(const String &format, const TArgs &... args)
```


| 参数 | 描述 |
| --- | --- |
| TArgs | 参数类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 格式 | const String\& | 格式字符串。 |
| args | const TArgs\&... | 要插入到格式字符串位置的参数。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
