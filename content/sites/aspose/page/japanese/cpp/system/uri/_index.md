---
title: "System::Uri クラス"
linktitle: "Uri"
second_title: "C++ 用 Aspose.Page"
description: "System::Uri クラス。統一リソース識別子。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 6700
url: /ja/cpp/system/uri/
---
## Uri class


統一リソース識別子。このクラスのオブジェクトは[System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを[System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class Uri : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [CheckHostName](./checkhostname/)(String) | 指定されたホスト名のタイプを判定します。 |
| static [CheckSchemeName](./checkschemename/)(const String\&) | 指定されたスキームが有効かどうかを判定します。 |
| static [Compare](./compare/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, UriComponents, UriFormat, StringComparison) | 指定された比較ルールを使用して指定された[Uri](./) オブジェクトを比較します。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 現在のオブジェクトと指定されたオブジェクトが表す URI が等しいかどうかを判定します。 |
| static [EscapeDataString](./escapedatastring/)(const String\&) | 文字列をエスケープ表現に変換します。 |
| static [EscapeUriString](./escapeuristring/)(const String\&) | URI 文字列をエスケープ表現に変換します。 |
| static [FromHex](./fromhex/)(char16_t) | 16 進数の桁の十進数値を取得します。 |
| [get_AbsolutePath](./get_absolutepath/)() const | URI の絶対パスを返します。 |
| [get_AbsoluteUri](./get_absoluteuri/)() const | 絶対 URI を返します。 |
| [get_Authority](./get_authority/)() const | サーバーのホスト名とポート番号を返します。 |
| [get_DnsSafeHost](./get_dnssafehost/)() const | エスケープされていないホスト名を返します。 |
| [get_Fragment](./get_fragment/)() const | エスケープされた URI フラグメントを返します。 |
| [get_Host](./get_host/)() const | ホスト名を返します。 |
| [get_HostNameType](./get_hostnametype/)() const | ホスト名の種類を返します。 |
| [get_IdnHost](./get_idnhost/)() const | ホストの国際化ドメイン名を返します。 |
| [get_IsAbsoluteUri](./get_isabsoluteuri/)() const | 現在のオブジェクトが表す URI が絶対パスかどうかを判断します。 |
| [get_IsDefaultPort](./get_isdefaultport/)() const | 現在のオブジェクトが表す URI が、そのスキームのデフォルトポートを持つかどうかを判断します。 |
| [get_IsFile](./get_isfile/)() const | 現在のオブジェクトが表す URI がファイルかどうかを判断します。 |
| [get_IsLoopback](./get_isloopback/)() const | 現在のオブジェクトが表す URI がローカルホストを参照しているかどうかを判断します。 |
| [get_IsUnc](./get_isunc/)() const | 現在のオブジェクトが表す URI が UNC パスかどうかを判断します。 |
| [get_LocalPath](./get_localpath/)() const | 現在のオブジェクトが表す URI が参照するファイル名の OS 表現を返します。 |
| [get_OriginalString](./get_originalstring/)() const | 現在のオブジェクトが構築されたときにコンストラクタに渡された URI 文字列を返します。 |
| [get_PathAndQuery](./get_pathandquery/)() const | 現在のオブジェクトが表す URI の絶対パスとクエリ コンポーネントを、クエスチョンマーク (?) で区切って返します。 |
| [get_Port](./get_port/)() const | 現在のオブジェクトが表す URI のポート番号を返します。 |
| [get_Query](./get_query/)() const | 現在のオブジェクトが表す URI に含まれるクエリ情報を返します。 |
| [get_Scheme](./get_scheme/)() const | 現在のオブジェクトが表す URI のスキームを返します。 |
| [get_Segments](./get_segments/)() const | 現在のオブジェクトが表す URI のパス セグメントを含む文字列配列を返します。 |
| [get_UserEscaped](./get_userescaped/)() const | 現在のオブジェクトのコンストラクタに渡された URI 文字列が完全にエスケープされているかどうかを判断します。 |
| [get_UserInfo](./get_userinfo/)() const | ユーザー名、パスワード、および現在のオブジェクトが表す URI に関連付けられたその他のユーザー情報を返します。 |
| [GetComponents](./getcomponents/)(UriComponents, UriFormat) const | 現在のオブジェクトが表す URI の指定されたコンポーネントを、指定されたエスケープ方式で返します。 |
| [GetHashCode](./gethashcode/)() const override | URI のハッシュコードを取得します。 |
| [GetLeftPart](./getleftpart/)(UriPartial) | 現在のオブジェクトが表す URI の指定された部分を返します。 |
| static [HexEscape](./hexescape/)(char16_t) | 指定された文字の十六進表現を返します。 |
| static [HexUnescape](./hexunescape/)(const String\&, int32_t\&) | 指定された文字の十六進表現を文字に変換します。 |
| [IsBaseOf](./isbaseof/)(const SharedPtr\<Uri\>\&) const | 現在の [Uri](./) オブジェクトが表す URI が、指定された [Uri](./) オブジェクトが表す URI のベースかどうかを判断します。 |
| static [IsHexDigit](./ishexdigit/)(char16_t) | 指定された文字が有効な十六進数字かどうかを判断します。 |
| static [IsHexEncoding](./ishexencoding/)(const String\&, int32_t) | 指定された文字列の指定位置にある文字が十六進エンコードされているかどうかを判断します。 |
| [IsWellFormedOriginalString](./iswellformedoriginalstring/)() const | この [Uri](./) を構築するために使用された文字列が正しく形成されているか、さらにエスケープする必要がないかを示します。 |
| static [IsWellFormedUriString](./iswellformeduristring/)(const String\&, UriKind) | 指定された文字列が正しく形成された URI かどうかを判断します。 |
| [MakeRelative](./makerelative/)(const SharedPtr\<Uri\>\&) | 2つの [Uri](./) インスタンス間の差異を判断します。 |
| [MakeRelativeUri](./makerelativeuri/)(const SharedPtr\<Uri\>\&) | 現在のオブジェクトと指定された [Uri](./) オブジェクトが表す URI 間の差異を判断します。 |
| [ToString](./tostring/)() const override | 現在のオブジェクトが表す URI の文字列表現を返します。 |
| static [TryCreate](./trycreate/)(const String\&, UriKind, SharedPtr\<Uri\>\&) | 指定された URI を表す [Uri](./) オブジェクトを作成します。引数は URI の種類を指定します。 |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) | ベース URI を表す指定された [Uri](./) オブジェクトと相対 URI の文字列表現から [Uri](./) オブジェクトを作成します。 |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) | 指定されたベース URI と相対 URI から [Uri](./) オブジェクトを作成します。 |
| static [UnescapeDataString](./unescapedatastring/)(const String\&) | 指定されたエスケープされた文字列のエスケープを解除します。 |
| [Uri](./uri/)(const String\&) | 指定された URI を表す [Uri](./) オブジェクトを作成します。 |
| [Uri](./uri/)(const String\&, bool) | 指定された URI を表す [Uri](./) オブジェクトを作成します。引数は URI をエスケープするかどうかを指定します。 |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&, bool) | ベース URI を表す指定された [Uri](./) オブジェクトと相対 URI の文字列表現から [Uri](./) オブジェクトを作成します。引数は URI をエスケープするかどうかを指定します。 |
| [Uri](./uri/)(const String\&, UriKind) | 指定された URI を表す [Uri](./) オブジェクトを作成します。引数は URI の種類を指定します。 |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&) | 指定されたベース URI と相対 URI から [Uri](./) オブジェクトを作成します。 |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) | 指定されたベース URI と相対 URI から [Uri](./) オブジェクトを作成します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [SchemeDelimiter](./schemedelimiter/) | [Uri](./) の通信プロトコル スキームとアドレス部分を区切る文字を指定します。 |
| static [UriSchemeFile](./urischemefile/) | [Uri](./) がファイルへのポインタであることを指定します。 |
| static [UriSchemeFtp](./urischemeftp/) | [Uri](./) がファイル転送プロトコルを介してアクセスされることを指定します。 |
| static [UriSchemeGopher](./urischemegopher/) | [Uri](./) が Gopher プロトコルを介してアクセスされることを指定します。 |
| static [UriSchemeHttp](./urischemehttp/) | [Uri](./) がハイパーテキスト転送プロトコル (HTTP) を介してアクセスされることを指定します。 |
| static [UriSchemeHttps](./urischemehttps/) | [Uri](./) がセキュアハイパーテキスト転送プロトコル (HTTPS) を介してアクセスされることを指定します。 |
| static [UriSchemeMailto](./urischememailto/) | [Uri](./) がメールアドレスであり、シンプルメール転送プロトコル (SMTP) を介してアクセスされることを指定します。 |
| static [UriSchemeNetPipe](./urischemenetpipe/) | [Uri](./) が [Windows](../../system.windows/) Communication Foundation が使用する NetPipe スキームを介してアクセスされることを指定します。 |
| static [UriSchemeNetTcp](./urischemenettcp/) | [Uri](./) が [Windows](../../system.windows/) Communication Foundation が使用する NetTcp スキームを介してアクセスされることを指定します。 |
| static [UriSchemeNews](./urischemenews/) | [Uri](./) がインターネットニュースグループであり、ネットワークニュース転送プロトコル (NNTP) を介してアクセスされることを指定します。 |
| static [UriSchemeNntp](./urischemenntp/) | [Uri](./) がインターネットニュースグループであり、ネットワークニュース転送プロトコル (NNTP) を介してアクセスされることを指定します。 |
## 備考



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

## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
