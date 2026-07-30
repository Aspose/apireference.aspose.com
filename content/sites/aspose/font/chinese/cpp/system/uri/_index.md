---
title: "System::Uri 类"
linktitle: "Uri"
second_title: "Aspose.Font 适用于 C++"
description: "System::Uri 类。统一资源标识符。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 6700
url: /zh/cpp/system/uri/
---
## Uri class


统一资源标识符。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class Uri : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [CheckHostName](./checkhostname/)(String) | 确定指定主机名的类型。 |
| static [CheckSchemeName](./checkschemename/)(const String\&) | 确定指定的方案是否有效。 |
| static [Compare](./compare/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, UriComponents, UriFormat, StringComparison) | 使用指定的比较规则比较指定的 [Uri](./) 对象。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 确定当前对象和指定对象所表示的 URI 是否相等。 |
| static [EscapeDataString](./escapedatastring/)(const String\&) | 将字符串转换为其转义表示形式。 |
| static [EscapeUriString](./escapeuristring/)(const String\&) | 将 URI 字符串转换为其转义表示形式。 |
| static [FromHex](./fromhex/)(char16_t) | 获取十六进制数字的十进制值。 |
| [get_AbsolutePath](./get_absolutepath/)() const | 返回 URI 的绝对路径。 |
| [get_AbsoluteUri](./get_absoluteuri/)() const | 返回绝对 URI。 |
| [get_Authority](./get_authority/)() const | 返回服务器的主机名和端口号。 |
| [get_DnsSafeHost](./get_dnssafehost/)() const | 返回未转义的主机名。 |
| [get_Fragment](./get_fragment/)() const | 返回已转义的 URI 片段。 |
| [get_Host](./get_host/)() const | 返回主机名。 |
| [get_HostNameType](./get_hostnametype/)() const | 返回主机名类型。 |
| [get_IdnHost](./get_idnhost/)() const | 返回主机的国际化域名。 |
| [get_IsAbsoluteUri](./get_isabsoluteuri/)() const | 确定当前对象表示的 URI 是否为绝对路径。 |
| [get_IsDefaultPort](./get_isdefaultport/)() const | 确定当前对象表示的 URI 是否具有该 URI 方案的默认端口。 |
| [get_IsFile](./get_isfile/)() const | 确定当前对象表示的 URI 是否为文件。 |
| [get_IsLoopback](./get_isloopback/)() const | 确定当前对象表示的 URI 是否引用本地主机。 |
| [get_IsUnc](./get_isunc/)() const | 确定当前对象表示的 URI 是否为 UNC 路径。 |
| [get_LocalPath](./get_localpath/)() const | 返回当前对象表示的 URI 所引用的文件名的操作系统表示形式。 |
| [get_OriginalString](./get_originalstring/)() const | 返回在构造当前对象时传递给构造函数的 URI 字符串。 |
| [get_PathAndQuery](./get_pathandquery/)() const | 返回当前对象表示的 URI 的绝对路径和查询组件，以问号 (?) 分隔。 |
| [get_Port](./get_port/)() const | 返回当前对象表示的 URI 的端口号。 |
| [get_Query](./get_query/)() const | 返回当前对象表示的 URI 中包含的查询信息。 |
| [get_Scheme](./get_scheme/)() const | 返回当前对象表示的 URI 的方案。 |
| [get_Segments](./get_segments/)() const | 返回一个字符串数组，包含当前对象表示的 URI 的路径段。 |
| [get_UserEscaped](./get_userescaped/)() const | 确定传递给当前对象构造函数的 URI 字符串是否已完全转义。 |
| [get_UserInfo](./get_userinfo/)() const | 返回与当前对象表示的 URI 关联的用户名、密码和其他用户信息。 |
| [GetComponents](./getcomponents/)(UriComponents, UriFormat) const | 返回使用指定转义方式的当前对象表示的 URI 的指定组件。 |
| [GetHashCode](./gethashcode/)() const override | 获取 URI 的哈希码。 |
| [GetLeftPart](./getleftpart/)(UriPartial) | 返回当前对象表示的 URI 的指定部分。 |
| static [HexEscape](./hexescape/)(char16_t) | 返回指定字符的十六进制等价值。 |
| static [HexUnescape](./hexunescape/)(const String\&, int32_t\&) | 将指定字符的十六进制表示转换为字符。 |
| [IsBaseOf](./isbaseof/)(const SharedPtr\<Uri\>\&) const | 确定当前 [Uri](./) 对象表示的 URI 是否是指定 [Uri](./) 对象表示的 URI 的基准。 |
| static [IsHexDigit](./ishexdigit/)(char16_t) | 确定指定字符是否表示有效的十六进制数字。 |
| static [IsHexEncoding](./ishexencoding/)(const String\&, int32_t) | 确定在指定字符串的指定位置的字符是否为十六进制编码。 |
| [IsWellFormedOriginalString](./iswellformedoriginalstring/)() const | 指示用于构造此 [Uri](./) 的字符串是否格式良好且不需要进一步转义。 |
| static [IsWellFormedUriString](./iswellformeduristring/)(const String\&, UriKind) | 确定指定字符串是否为格式良好的 URI。 |
| [MakeRelative](./makerelative/)(const SharedPtr\<Uri\>\&) | 确定两个 [Uri](./) 实例之间的差异。 |
| [MakeRelativeUri](./makerelativeuri/)(const SharedPtr\<Uri\>\&) | 确定当前对象和指定的 [Uri](./) 对象所表示的 URI 之间的差异。 |
| [ToString](./tostring/)() const override | 返回当前对象所表示的 URI 的字符串表示形式。 |
| static [TryCreate](./trycreate/)(const String\&, UriKind, SharedPtr\<Uri\>\&) | 构造一个表示指定 URI 的 [Uri](./) 对象；参数指定 URI 的类型。 |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) | 从表示基 URI 的指定 [Uri](./) 对象和相对 URI 的字符串表示构造一个 [Uri](./) abject。 |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) | 从指定的基 URI 和相对 URI 构造一个 [Uri](./) abject。 |
| static [UnescapeDataString](./unescapedatastring/)(const String\&) | 对指定的已转义字符串进行反转义。 |
| [Uri](./uri/)(const String\&) | 构造一个表示指定 URI 的 [Uri](./) 对象。 |
| [Uri](./uri/)(const String\&, bool) | 构造一个表示指定 URI 的 [Uri](./) 对象；参数指定是否应对 URI 进行转义。 |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&, bool) | 从表示基 URI 的指定 [Uri](./) 对象和相对 URI 的字符串表示构造一个 [Uri](./) abject；参数指定是否应对 URI 进行转义。 |
| [Uri](./uri/)(const String\&, UriKind) | 构造一个表示指定 URI 的 [Uri](./) 对象；参数指定 URI 的类型。 |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&) | 从指定的基 URI 和相对 URI 构造一个 [Uri](./) abject。 |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) | 从指定的基 URI 和相对 URI 构造一个 [Uri](./) abject。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [SchemeDelimiter](./schemedelimiter/) | 指定用于分隔通信协议方案和 [Uri](./) 地址部分的字符。 |
| static [UriSchemeFile](./urischemefile/) | 指定 [Uri](./) 为指向文件的指针。 |
| static [UriSchemeFtp](./urischemeftp/) | 指定通过文件传输协议访问 [Uri](./)。 |
| static [UriSchemeGopher](./urischemegopher/) | 指定通过 Gopher 协议访问 [Uri](./)。 |
| static [UriSchemeHttp](./urischemehttp/) | 指定通过超文本传输协议访问 [Uri](./)。 |
| static [UriSchemeHttps](./urischemehttps/) | 指定通过安全超文本传输协议访问 [Uri](./)。 |
| static [UriSchemeMailto](./urischememailto/) | 指定 [Uri](./) 为电子邮件地址，并通过简单邮件传输协议访问。 |
| static [UriSchemeNetPipe](./urischemenetpipe/) | 指定通过 [Windows](../../system.windows/) 通信基金会使用的 NetPipe 方案访问 [Uri](./)。 |
| static [UriSchemeNetTcp](./urischemenettcp/) | 指定通过 [Windows](../../system.windows/) 通信基金会使用的 NetTcp 方案访问 [Uri](./)。 |
| static [UriSchemeNews](./urischemenews/) | 指定 [Uri](./) 为互联网新闻组，并通过网络新闻传输协议访问。 |
| static [UriSchemeNntp](./urischemenntp/) | 指定 [Uri](./) 为互联网新闻组，并通过网络新闻传输协议访问。 |
## 备注



```cpp
#include "system/smart_ptr.h"
#include "system/uri.h"
#include <iostream>

int main()
{
  const auto uri = System::MakeObject<System::Uri>(u"https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/");

std::cout <<
  "AbsolutePath: " << uri->get_AbsolutePath() << std::endl <<
  "AbsoluteUri: " << uri->get_AbsoluteUri() << std::endl <<
  "Authority: " << uri->get_Authority() << std::endl <<
  "DnsSafeHost: " << uri->get_DnsSafeHost() << std::endl <<
  "Fragment: " << uri->get_Fragment() << std::endl <<
  "Host: " << uri->get_Host() << std::endl <<
  "IdnHost: " << uri->get_IdnHost() << std::endl <<
  "LocalPath: " << uri->get_LocalPath() << std::endl <<
  "OriginalString: " << uri->get_OriginalString() << std::endl <<
  "PathAndQuery: " << uri->get_PathAndQuery() << std::endl <<
  "Port: " << uri->get_Port() << std::endl <<
  "Query: " << uri->get_Query() << std::endl <<
  "Scheme: " << uri->get_Scheme() << std::endl;

  return 0;
}
/*
This code example produces the following output:
AbsolutePath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
AbsoluteUri: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Authority: docs.codeporting.com
DnsSafeHost: docs.codeporting.com
Fragment:
Host: docs.codeporting.com
IdnHost: docs.codeporting.com
LocalPath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
OriginalString: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
PathAndQuery: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Port: 443
Query:
Scheme: https
*/
```

## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
