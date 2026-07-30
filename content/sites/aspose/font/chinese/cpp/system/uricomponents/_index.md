---
title: "System::UriComponents 枚举"
linktitle: "UriComponents"
second_title: "Aspose.Font 适用于 C++"
description: "System::UriComponents 枚举。表示 C++ 中的 URI 组件。"
type: docs
weight: 8900
url: /zh/cpp/system/uricomponents/
---
## UriComponents enum


表示 URI 组件。

```cpp
enum class UriComponents
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 方案 | 1 | Scheme 数据。 |
| UserInfo | 2 | UserInfo 数据。 |
| Host | 4 | Host 数据。 |
| Port | 8 | Port 数据。 |
| SchemeAndServer | n/a | Scheme、Host 和 Port 数据。 |
| 路径 | 16 | LocalPath 数据。 |
| 查询 | 32 | Query 数据。 |
| PathAndQuery | n/a | LocalPath 和 Query 数据。 |
| HttpRequestUrl | n/a | Scheme、Host、Port、Query 和 LocalPath 数据。 |
| Fragment | 64 | Fragment 数据。 |
| AbsoluteUri | n/a | Scheme、Host、Port、Quer、LocalPath 和 Fragment 数据。 |
| StrongPort | 128 | Port 数据；如果在 [Uri](../uri/) 中未出现端口数据且已为 Scheme 分配了默认端口，则返回默认端口；如果没有默认端口，则返回 -1。 |
| HostAndPort | n/a | 主机和端口数据；如果在 [Uri](../uri/) 中不存在端口数据且已为 Scheme 分配了默认端口，则返回默认端口。如果没有默认端口，则返回 -1。 |
| StrongAuthority | n/a | UserInfo、主机和端口数据。如果在 [Uri](../uri/) 中没有端口数据且已为 Scheme 分配了默认端口，则返回默认端口。如果没有默认端口，则返回 -1。 |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | 指定应包含分隔符。 |
| SerializationInfoString | n/a | 完整的 [Uri](../uri/) 上下文，供 [Uri](../uri/) 序列化程序使用。该上下文包括 IPv6 范围。 |

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
