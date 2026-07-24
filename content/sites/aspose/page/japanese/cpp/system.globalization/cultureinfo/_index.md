---
title: "System::Globalization::CultureInfo クラス"
linktitle: "CultureInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::CultureInfo クラス。カルチャ固有の値とアルゴリズムのコレクションです。Setter 操作は読み取り専用でないオブジェクトでのみ有効です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にはそのポインタを使用してください。"
type: docs
weight: 500
url: /ja/cpp/system.globalization/cultureinfo/
---
## CultureInfo class


カルチャ固有の値とアルゴリズムのコレクションです。Setter 操作は読み取り専用でないオブジェクトでのみ有効です。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class CultureInfo : public virtual System::Object,
                    public System::IFormatProvider,
                    public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ClearCachedData](./clearcacheddata/)() | キャッシュされたカルチャ情報を更新します。 |
| [Clone](./clone/)() override | カルチャ情報をクローンします。 |
| static [CreateSpecificCulture](./createspecificculture/)(const String\&) | 名前でカルチャを作成します。 |
| explicit [CultureInfo](./cultureinfo/)(int) | RTTI 情報。 |
| [CultureInfo](./cultureinfo/)(int, bool) | コンストラクタ。 |
| explicit [CultureInfo](./cultureinfo/)(const String\&) | コンストラクタ。 |
| [CultureInfo](./cultureinfo/)(const String\&, bool) | コンストラクタ。 |
| [CultureInfo](./cultureinfo/)(std::nullptr_t) | 常に ArgumentNullException をスローします。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | オブジェクトを比較します。 |
| virtual [get_Calendar](./get_calendar/)() const | カルチャで使用されるカレンダーを取得します。 |
| virtual [get_CompareInfo](./get_compareinfo/)() const | カルチャ規則に従う文字列比較子を取得します。 |
| [get_CultureTypes](./get_culturetypes/)() const | 現在のカルチャを表すカルチャタイプのビット単位結合を取得します。 |
| static [get_CurrentCulture](./get_currentculture/)() | 現在のスレッドに設定されたカルチャを取得します。 |
| static [get_CurrentUICulture](./get_currentuiculture/)() | 現在のスレッドの UI カルチャを取得します。 |
| virtual [get_DateTimeFormat](./get_datetimeformat/)() const | 日付形式情報を取得します。 |
| static [get_DefaultThreadCurrentCulture](./get_defaultthreadcurrentculture/)() | 現在のアプリケーションドメインのデフォルトカルチャを取得します。 |
| static [get_DefaultThreadCurrentUICulture](./get_defaultthreadcurrentuiculture/)() | 現在のアプリケーションドメインのデフォルト UI カルチャを取得します。 |
| virtual [get_DisplayName](./get_displayname/)() const | カルチャの表示名を取得します。 |
| virtual [get_EnglishName](./get_englishname/)() const | カルチャの英語名を取得します。 |
| [get_IetfLanguageTag](./get_ietflanguagetag/)() const | 言語の RFC 4646 名を取得します。 |
| static [get_InstalledUICulture](./get_installeduiculture/)() | オペレーティングシステムにインストールされたカルチャを取得します。 |
| static [get_InvariantCulture](./get_invariantculture/)() | 不変カルチャを取得します。 |
| virtual [get_IsNeutralCulture](./get_isneutralculture/)() const | カルチャが中立かどうかを確認します。 |
| [get_IsReadOnly](./get_isreadonly/)() const | カルチャー オブジェクトが読み取り専用かどうかをチェックします。 |
| virtual [get_KeyboardLayoutId](./get_keyboardlayoutid/)() const | アクティブな入力ロケール識別子を取得します。 |
| virtual [get_LCID](./get_lcid/)() const | カルチャー識別子を取得します。 |
| virtual [get_Name](./get_name/)() const | カルチャー名を取得します。 |
| virtual [get_NativeName](./get_nativename/)() const | カルチャーのネイティブ名を取得します。 |
| virtual [get_NumberFormat](./get_numberformat/)() const | 数値書式情報を取得します。 |
| virtual [get_OptionalCalendars](./get_optionalcalendars/)() const | カルチャーで使用できるカレンダーの一覧です。 |
| virtual [get_Parent](./get_parent/)() const | 親カルチャーを取得します。 |
| virtual [get_TextInfo](./get_textinfo/)() const | カルチャーで使用されるテキスト パラメータを取得します。 |
| virtual [get_ThreeLetterISOLanguageName](./get_threeletterisolanguagename/)() const | 3 文字の ISO 639-2 言語コードを取得します。 |
| virtual [get_ThreeLetterWindowsLanguageName](./get_threeletterwindowslanguagename/)() const | [Windows](../../system.windows/) API で定義されている言語の 3 文字コードを取得します。 |
| virtual [get_TwoLetterISOLanguageName](./get_twoletterisolanguagename/)() const | カルチャーに関連付けられた 2 文字の ISO 言語名を取得します。 |
| [get_UseUserOverride](./get_useuseroverride/)() const | [CultureInfo](./) がユーザー選択のカルチャー設定を使用しているかどうかを示すフラグを取得します。 |
| [GetConsoleFallbackUICulture](./getconsolefallbackuiculture/)() const | コンソール アプリケーションに適した代替カルチャーを取得します。 |
| static [GetCultureInfo](./getcultureinfo/)(const String\&) | 名前でカルチャーを取得します。CreateSpecificCulture と同じです。 |
| static [GetCultureInfo](./getcultureinfo/)(const String\&, const String\&) | 名前でカルチャーを取得します。 |
| static [GetCultureInfo](./getcultureinfo/)(int32_t) | ID でカルチャーを取得します。 |
| static [GetCultureInfoByIetfLanguageTag](./getcultureinfobyietflanguagetag/)(const String\&) | 非推奨です。指定された RFC 4646 言語タグで読み取り専用の [CultureInfo](./) オブジェクトを取得します。 |
| static [GetCultures](./getcultures/)(CultureTypes) | 指定されたタイプに該当するカルチャーを取得します。 |
| [GetFormat](./getformat/)(const TypeInfo\&) override | 特定のタイプの書式オブジェクトを取得します。 |
| [GetHashCode](./gethashcode/)() const override | オブジェクトのハッシュコードを返します。 |
| [IsInherited](./isinherited/)() const | 継承フラグを取得します。内部使用向けです。 |
| [operator=](./operator=/)(const CultureInfo\&) |  |
| [operator==](./operator==/)(const CultureInfo\&) const | カルチャー パラメータを比較します。 |
| static [ReadOnly](./readonly/)(const CultureInfoPtr\&) | カルチャーの読み取り専用バージョンを取得します。 |
| static [set_CurrentCulture](./set_currentculture/)(const CultureInfoPtr\&) | 現在のスレッドのカルチャーを設定します。 |
| static [set_CurrentUICulture](./set_currentuiculture/)(const CultureInfoPtr\&) | 現在のスレッドの UI カルチャーを設定します。 |
| virtual [set_DateTimeFormat](./set_datetimeformat/)(DateTimeFormatInfoPtr) | 日付形式情報を設定します。 |
| static [set_DefaultThreadCurrentCulture](./set_defaultthreadcurrentculture/)(const CultureInfoPtr\&) | 現在のアプリケーションドメインでデフォルトのカルチャを設定します。 |
| static [set_DefaultThreadCurrentUICulture](./set_defaultthreadcurrentuiculture/)(const CultureInfoPtr\&) | 現在のアプリケーションドメインでデフォルトの UI カルチャを設定します。 |
| virtual [set_NumberFormat](./set_numberformat/)(NumberFormatInfoPtr) | 数値書式情報を取得します。 |
| [ToString](./tostring/)() const override | カルチャを文字列に変換します。 |
## 参照

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
