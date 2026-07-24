---
title: "System::Net::Cookie クラス"
linktitle: "クッキー"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Cookie クラス。HTTP クッキーを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数として渡す際はそのポインタを使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.net/cookie/
---
## Cookie class


HTTP クッキーを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数として渡す際はそのポインタを使用してください。

```cpp
class Cookie : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() | 現在のインスタンスのコピーを作成します。 |
| [Cookie](./cookie/)() | 新しいインスタンスを構築します。 |
| [Cookie](./cookie/)(String, String) | 新しいインスタンスを構築します。 |
| [Cookie](./cookie/)(String, String, String) | 新しいインスタンスを構築します。 |
| [Cookie](./cookie/)(String, String, String, String) | 新しいインスタンスを構築します。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_Comment](./get_comment/)() const | 'Comment' 属性の値を取得します。 |
| [get_CommentUri](./get_commenturi/)() const | 'CommentURL' 属性の値を取得します。 |
| [get_Discard](./get_discard/)() const | 'Discard' 属性の値を取得します。 |
| [get_Domain](./get_domain/)() const | 'Domain' 属性の値を取得します。 |
| [get_DomainImplicit](./get_domainimplicit/)() | ドメインが暗黙的かどうかを示す値を取得します。 |
| [get_DomainKey](./get_domainkey/)() const | ドメインキーを返します。 |
| [get_Expired](./get_expired/)() | クッキーが期限切れかどうかを示す値を取得します。 |
| [get_Expires](./get_expires/)() | 'Expires' 属性の値を取得します。 |
| [get_HttpOnly](./get_httponly/)() const | 'HttpOnly' 属性の値を取得します。 |
| [get_Name](./get_name/)() const | クッキーの名前を取得します。 |
| [get_Path](./get_path/)() const | 'Path' 属性の値を取得します。 |
| [get_Plain](./get_plain/)() const | クッキー仕様が 'Plain' かどうかを示す値を返します。 |
| [get_Port](./get_port/)() const | 'Port' 属性の値を取得します。 |
| [get_PortList](./get_portlist/)() const | 'Port' 属性の値のコレクションを返します。 |
| [get_Secure](./get_secure/)() const | 'Secure' 属性の値を取得します。 |
| [get_TimeStamp](./get_timestamp/)() const | クッキーが作成された時刻を返します。 |
| [get_Value](./get_value/)() const | クッキーの'value'を取得します。 |
| [get_Variant](./get_variant/)() const | クッキーの仕様を取得します。 |
| [get_Version](./get_version/)() const | '[Version](../../system/version/)'属性の値を取得します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| [InternalSetName](./internalsetname/)(String) | このメソッドは、他のメソッドから呼び出され、メソッド名を設定します。 |
| [set_Comment](./set_comment/)(String) | 'Comment'属性の値を設定します。 |
| [set_CommentUri](./set_commenturi/)(System::SharedPtr\<Uri\>) | 'CommentURL'属性の値を設定します。 |
| [set_Discard](./set_discard/)(bool) | 'Discard'属性の値を設定します。 |
| [set_Domain](./set_domain/)(String) | 'Domain'属性の値を設定します。 |
| [set_DomainImplicit](./set_domainimplicit/)(bool) | ドメインが暗黙的かどうかを示す値を設定します。 |
| [set_Expired](./set_expired/)(bool) | クッキーが期限切れかどうかを示す値を設定します。 |
| [set_Expires](./set_expires/)(DateTime) | 'Expires'属性の値を設定します。 |
| [set_HttpOnly](./set_httponly/)(bool) | 'HttpOnly'属性の値を設定します。 |
| [set_Name](./set_name/)(String) | クッキーの名前を設定します。 |
| [set_Path](./set_path/)(String) | 'Path'属性の値を設定します。 |
| [set_Port](./set_port/)(String) | 'Port'属性の値を設定します。 |
| [set_Secure](./set_secure/)(bool) | 'Secure'属性の値を設定します。 |
| [set_Value](./set_value/)(String) | クッキーの値を設定します。 |
| [set_Variant](./set_variant/)(CookieVariant) | クッキーの仕様を設定します。 |
| [set_Version](./set_version/)(int32_t) | '[Version](../../system/version/)'属性の値を設定します。 |
| [ToServerString](./toserverstring/)() | 現在のインスタンスを文字列表現にシリアライズします。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| [VerifySetDefaults](./verifysetdefaults/)(CookieVariant, System::SharedPtr\<Uri\>, bool, String, bool, bool) | デフォルト属性の値を検証し、設定します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [CommentAttributeName](./commentattributename/) | 'Comment'属性の名前です。 |
| static [CommentUrlAttributeName](./commenturlattributename/) | 'CommentURL'属性の名前です。 |
| static [DiscardAttributeName](./discardattributename/) | 'Discard'属性の名前です。 |
| static [DomainAttributeName](./domainattributename/) | 'Domain'属性の名前です。 |
| static [EqualsLiteral](./equalsliteral/) | 属性の名前と値を区切るために使用されるセパレーター。 |
| static [ExpiresAttributeName](./expiresattributename/) | 'Expires' 属性の名前。 |
| static [HttpOnlyAttributeName](./httponlyattributename/) | 'HttpOnly' 属性の名前。 |
| static [MaxAgeAttributeName](./maxageattributename/) | 'Max-Age' 属性の名前。 |
| static [MaxSupportedVersion](./maxsupportedversion/) | RTTI 情報。 |
| static [MaxSupportedVersionString](./maxsupportedversionstring/) | サポートされている最大バージョンの文字列表現。 |
| static [PathAttributeName](./pathattributename/) | 'Path' 属性の名前。 |
| static [PortAttributeName](./portattributename/) | 'Port' 属性の名前。 |
| static [PortSplitDelimiters](./portsplitdelimiters/) | 'Port' 属性の値の区切り文字を含む配列。 |
| static [QuotesLiteral](./quotesliteral/) | 属性の各部分を囲むために使用されるシンボル。 |
| static [ReservedToName](./reservedtoname/) | クッキー名に予約されている値。 |
| static [ReservedToValue](./reservedtovalue/) | クッキー値に予約されている値。 |
| static [SecureAttributeName](./secureattributename/) | 'Secure' 属性の名前。 |
| static [SeparatorLiteral](./separatorliteral/) | 属性セパレーター。 |
| static [SpecialAttributeLiteral](./specialattributeliteral/) | 特別な属性名のプレフィックス。 |
| static [VersionAttributeName](./versionattributename/) | '[Version](../../system/version/)' 属性の名前。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
