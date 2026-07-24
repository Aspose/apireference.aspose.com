---
title: "System::String クラス"
linktitle: "String"
second_title: "C++ 用 Aspose.Page"
description: "System::String クラス。ライブラリ全体で使用される文字列クラスです。コード変換時の C# の System.String の代替として使用されます。最適化上の理由で Object のサブクラスとはみなされません。この型はスタック上に割り当て、関数に値渡しまたは参照渡しで渡すべきです。C++ でこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 5800
url: /ja/cpp/system/string/
---
## String class


[String](./) class used across the library. Is a substitute for C# [System.String](./) when translating code. For optimization reasons, isn't considered an [Object](../object/) subclass. This type should be allocated on stack and passed to functions by value or by reference. Never use [System::SmartPtr](../smartptr/) class to manage objects of this type.

```cpp
class String
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ASPOSECPP_VALUE_TYPE_IMPLEMENTS_INTERFACES](./asposecpp_value_type_implements_interfaces/)() | [String](./) は C++ 側で暗黙的に（継承なしで）いくつかのインターフェイスを実装する値型です。 |
| [begin](./begin/)() const | 実際の文字列バッファの先頭へのポインタを返します。何も再割り当てしません。バッファがヌル終端であることは保証しません。 |
| [Clone](./clone/)() const | 現在の文字列のコピーを作成します。 |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool) | Less-equal-greaterは2つのサブ文字列を比較します。 |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greaterは2つのサブ文字列を比較します。 |
| static [Compare](./compare/)(const String\&, const String\&, System::StringComparison) | Less-equal-greaterは2つの文字列を比較します。 |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, System::StringComparison) | Less-equal-greaterは2つの文字列を比較します。 |
| static [Compare](./compare/)(const String\&, const String\&, bool) | Less-equal-greaterは2つの文字列を比較します。 |
| static [Compare](./compare/)(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greaterは2つの文字列を比較します。 |
| static [CompareOrdinal](./compareordinal/)(const String\&, const String\&) | Less-equal-greaterはOrdinalモードを使用して2つの文字列を比較します。 |
| static [CompareOrdinal](./compareordinal/)(const String\&, int, const String\&, int, int) | Less-equal-greaterはOrdinalモードを使用して2つの文字列を比較します。 |
| [CompareTo](./compareto/)(const String\&) const | 'less-equals-more'スタイルで2つの文字列を比較します。現在のカルチャを使用します。 |
| static [Concat](./concat/)(const ArrayPtr\<String\>\&) | 文字列を連結します。 |
| static [Concat](./concat/)(const String\&, const String\&) | 文字列を連結します。 |
| static [Concat](./concat/)(const String\&, const String\&, const String\&) | 文字列を連結します。 |
| static [Concat](./concat/)(const String\&, const String\&, const String\&, const String\&) | 文字列を連結します。 |
| [Contains](./contains/)(const String\&) const | str が現在の文字列のサブ文字列かどうかをチェックします。 |
| [Contains](./contains/)(char16_t) const | 文字列が指定された文字を含むかどうかをチェックします。 |
| static [Copy](./copy/)(const String\&) | 文字列のコピーを作成します。 |
| [CopyTo](./copyto/)(int, const ArrayPtr\<char_t\>\&, int, int) const | 文字列の文字を既存の配列要素にコピーします。サイズ変更は行われません。 |
| [end](./end/)() const | 実際の文字列バッファの末尾へのポインタを返します。何も再割り当てしません。バッファがヌル終端であることは保証しません。 |
| [EndsWith](./endswith/)(const String\&) const | 文字列が指定されたサブ文字列で終わるかどうかをチェックします。 |
| [EndsWith](./endswith/)(const String\&, System::StringComparison) const | 文字列が指定されたサブ文字列で終わるかどうかをチェックします。 |
| [EndsWith](./endswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | 文字列が指定されたサブ文字列で終わるかどうかをチェックします。 |
| [Equals](./equals/)(const String\&, System::StringComparison) const | [String](./) の等価比較。いくつかのモードは [StringComparison](../stringcomparison/) 列挙体で提供されています。 |
| [Equals](./equals/)(const String\&) const | [String](./) の等価比較。[System::StringComparison::Ordinal](../stringcomparison/) 比較モードを使用します。 |
| static [Equals](./equals/)(const String\&, const String\&) | EqualはOrdinal比較モードを使用して2つの文字列を比較します。 |
| static [Equals](./equals/)(const String\&, const String\&, System::StringComparison) | Equalは2つの文字列を比較します。 |
| [FastToAscii](./fasttoascii/)(char, int) const | [String](./) をASCII文字列に変換しようとします。 |
| static [Format](./format/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const Args\&...) | 文字列をC#スタイルでフォーマットします。 |
| static [Format](./format/)(std::nullptr_t, const String\&, const Args\&...) | 文字列をC#スタイルでフォーマットします。 |
| static [Format](./format/)(std::nullptr_t, const char16_t(&), const Args\&...) | 文字列をC#スタイルでフォーマットします。 |
| static [Format](./format/)(const String\&, const Args\&...) | 文字列をC#スタイルでフォーマットします。 |
| static [Format](./format/)(const String\&, const System::ArrayPtr\<T\>\&) | 文字列をC#スタイルでフォーマットします。 |
| static [FromAscii](./fromascii/)(const char *) | ASCII文字列から [String](./) を作成します。 |
| static [FromAscii](./fromascii/)(const char *, int) | ASCII文字列から [String](./) を作成します。 |
| static [FromAscii](./fromascii/)(const std::string\&) | ASCII文字列から [String](./) を作成します。 |
| static [FromUtf16](./fromutf16/)(const std::u16string\&) | utf16文字列から [String](./) を作成します。 |
| static [FromUtf32](./fromutf32/)(const uint32_t *, int32_t) | utf32文字列から [String](./) を作成します。 |
| static [FromUtf8](./fromutf8/)(const char *) | utf8文字列から [String](./) を作成します。 |
| static [FromUtf8](./fromutf8/)(const char *, int) | utf8文字列から [String](./) を作成します。 |
| static [FromUtf8](./fromutf8/)(const uint8_t *) | utf8文字列から [String](./) を作成します。 |
| static [FromUtf8](./fromutf8/)(const std::string\&) | utf8文字列から [String](./) を作成します。 |
| static [FromWCS](./fromwcs/)(const std::wstring\&) | widestringから [String](./) を作成します。 |
| [get_Length](./get_length/)() const | 文字列の長さを取得します。 |
| [GetHashCode](./gethashcode/)() const | ハッシュが含まれる文字列。ICUで実装されており、C#のハッシュとは一致しません。 |
| [IndexOf](./indexof/)(const String\&, System::StringComparison) const | 部分文字列の前方検索。 |
| [IndexOf](./indexof/)(char_t, int) const | 文字の前方検索。 |
| [IndexOf](./indexof/)(char_t, int, int) const | 部分文字列内の文字の前方検索。 |
| [IndexOf](./indexof/)(const String\&, int) const | 部分文字列の前方検索。 |
| [IndexOf](./indexof/)(const String\&, int, System::StringComparison) const | 部分文字列の前方検索。 |
| [IndexOf](./indexof/)(const String\&, int, int, System::StringComparison) const | 部分文字列の前方検索。 |
| [IndexOf](./indexof/)(const String\&, int, int) const | 部分文字列の前方検索。 |
| [IndexOfAny](./indexofany/)(char_t, int) const | 文字の前方検索。 |
| [IndexOfAny](./indexofany/)(const String\&, int) const | その結果、this 内で str のすべての文字を検索します。最初の文字が見つかった場合、その位置が返され、見つからなければ次の文字を検索し、以下同様に続きます。 |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&) const | 渡された文字のいずれかを文字列全体で検索します。最初の文字を anyOf のすべての文字と比較し、次の文字を比較するという順序で行います。対象文字のいずれかに最初に一致した文字のインデックスを返します。 |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | 渡された文字のいずれかを部分文字列で検索します。最初の文字を anyOf のすべての文字と比較し、次の文字を比較するという順序で行います。対象文字のいずれかに最初に一致した文字のインデックスを返します。 |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | 渡された文字のいずれかを部分文字列で検索します。最初の文字を anyOf のすべての文字と比較し、次の文字を比較するという順序で行います。対象文字のいずれかに最初に一致した文字のインデックスを返します。 |
| [Insert](./insert/)(int, const String\&) const | 指定された位置に部分文字列を挿入します。 |
| [Is](./is/)(const System::TypeInfo\&) const | 文字列オブジェクトが渡された[TypeInfo](../typeinfo/)で指定された型かどうかをチェックします。 |
| [IsAsciiString](./isasciistring/)() const | [String](./) が ASCII 記号のみを含むかどうかを示します。 |
| [IsEmpty](./isempty/)() const | 文字列が null ではなくかつ空であるかどうかをチェックします。 |
| [IsNormalized](./isnormalized/)(System::Text::NormalizationForm) const | Unicode 文字列が指定された正規化形式で正規化されているかどうかをチェックします。 |
| [IsNull](./isnull/)() const | 文字列が null と見なされるかどうかをチェックします。[String](./) は、[String()](./string/) コンストラクタで作成された場合、または null 文字列から移動、コピー、代入された場合、もしくは [reset()](./reset/) メソッドが呼び出された場合にのみ null となります。 |
| [IsNullOrEmpty](./isnullorempty/)() const | 文字列が空であるか、null と見なされるかどうかをチェックします。 |
| static [IsNullOrEmpty](./isnullorempty/)(const String\&) | 渡された文字列が null または空であるかどうかをチェックします。 |
| static [IsNullOrWhiteSpace](./isnullorwhitespace/)(const String\&) | 指定された文字列が null、空、または空白文字だけで構成されているかどうかを示します。 |
| static [Join](./join/)(const String\&, const ArrayPtr\<String\>\&, int, int) | 文字列を区切り文字として配列を結合します。 |
| static [Join](./join/)(const String\&, const System::Details::ArrayView\<String\>\&, int, int) | 文字列を区切り文字として配列を結合します。 |
| static [Join](./join/)(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) | 文字列を区切り文字として配列を結合します。 |
| static [Join](./join/)(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) | 文字列を区切り文字として配列を結合します。 |
| [LastIndexOf](./lastindexof/)(const String\&, int) const | 部分文字列の後方検索。 |
| [LastIndexOf](./lastindexof/)(const String\&, System::StringComparison) const | 部分文字列の後方検索。 |
| [LastIndexOf](./lastindexof/)(const String\&, int, System::StringComparison) const | 部分文字列の後方検索。 |
| [LastIndexOf](./lastindexof/)(const String\&, int, int, StringComparison) const | 部分文字列の後方検索。 |
| [LastIndexOf](./lastindexof/)(char_t) const | 文字の後方検索。 |
| [LastIndexOf](./lastindexof/)(char_t, int32_t) const | 文字の後方検索。 |
| [LastIndexOf](./lastindexof/)(char_t, int32_t, int32_t) const | 文字の後方検索。 |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&) const | 渡された文字のいずれかを文字列全体で後方に検索します。最後の文字を anyOf のすべての文字と比較し、前の文字を比較するという順序で行います。最初に一致した文字のインデックスを返します。 |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | 渡された文字のいずれかを部分文字列で後方に検索します。最後の文字を anyOf のすべての文字と比較し、前の文字を比較するという順序で行います。最初に一致した文字のインデックスを返します。 |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | 渡された文字のいずれかを部分文字列で後方に検索します。最後の文字を anyOf のすべての文字と比較し、前の文字を比較するという順序で行います。最初に一致した文字のインデックスを返します。 |
| [Normalize](./normalize/)(System::Text::NormalizationForm) const | 指定された正規化形式を使用して Unicode 文字列を正規化します。 |
| [operator!=](./operator!=/)(const String\&) const | 非等価比較演算子。 |
| [operator!=](./operator!=/)(std::nullptr_t) const | 文字列が null でないかどうかをチェックします。[IsNull()](./isnull/) 呼び出しと同じロジックが適用されます。 |
| [operator+](./operator+/)(const String\&) const | [String](./) 連結演算子。 |
| [operator+](./operator+/)(const T\&) const | [String](./) の文字列リテラルまたは文字列ポインタとの連結。 |
| [operator+](./operator+/)(char_t) const | 文字を文字列の末尾に追加します。 |
| [operator+](./operator+/)(int) const | 整数値の文字列表現を文字列の末尾に追加します。 |
| [operator+](./operator+/)(uint32_t) const | 符号なし整数値の文字列表現を文字列の末尾に追加します。 |
| [operator+](./operator+/)(double) const | 浮動小数点値の文字列表現を文字列の末尾に追加します。 |
| [operator+](./operator+/)(int64_t) const | 整数値の文字列表現を文字列の末尾に追加します。 |
| [operator+](./operator+/)(const T\&) const | 参照型オブジェクトの文字列表現を文字列の末尾に追加します。 |
| [operator+](./operator+/)(const T\&) const | 参照型オブジェクトの文字列表現を文字列の末尾に追加します。 |
| [operator+](./operator+/)(T) const | ブール値の文字列表現を文字列の末尾に追加します。 |
| [operator+=](./operator+=/)(char_t) | 連結代入演算子。 |
| [operator+=](./operator+=/)(const String\&) | 連結代入演算子。 |
| [operator+=](./operator+=/)(double) | 連結代入演算子。 |
| [operator+=](./operator+=/)(uint8_t) | 連結代入演算子。 |
| [operator+=](./operator+=/)(int16_t) | 連結代入演算子。 |
| [operator+=](./operator+=/)(uint16_t) | 連結代入演算子。 |
| [operator+=](./operator+=/)(int32_t) | 連結代入演算子。 |
| [operator+=](./operator+=/)(uint32_t) | 連結代入演算子。 |
| [operator+=](./operator+=/)(int64_t) | 連結代入演算子。 |
| [operator+=](./operator+=/)(uint64_t) | 連結代入演算子。 |
| [operator+=](./operator+=/)(T) | 連結代入演算子。 |
| [operator<](./operator_/)(const String\&) const | 文字列を順序比較します。 |
| [operator=](./operator=/)(const String\&) | 代入演算子。 |
| [operator=](./operator=/)(String\&&) | ムーブ代入演算子。 |
| [operator==](./operator==/)(const String\&) const | 等価比較演算子。 |
| [operator==](./operator==/)(std::nullptr_t) const | 文字列が null かどうかをチェックします。 [IsNull()](./isnull/) 呼び出しと同じロジックが適用されます。 |
| [operator>](./operator_/)(const String\&) const | 文字列を順序比較します。 |
| [operator[]](./operator[]/)(int) const | 指定位置の文字を取得します。 |
| [PadLeft](./padleft/)(int, char_t) const | 元の文字列の左側にパディングを追加します。 |
| [PadRight](./padright/)(int, char_t) const | 元の文字列の右側にパディングを追加します。 |
| [rbegin](./rbegin/)() const | 実際の文字列バッファの最後の文字（存在する場合）への逆イテレータを返します。 |
| [Remove](./remove/)(int32_t, int32_t) const | 現在の文字列からサブ文字列以外のすべてを抽出します。 |
| [rend](./rend/)() const | 実際の文字列バッファの最初の文字の前（存在する場合）への逆イテレータを返します。 |
| [Replace](./replace/)(char_t, char_t) const | 文字列内の文字のすべての出現を置換します。 |
| [Replace](./replace/)(const String\&, const String\&) const | この文字列内の検索対象のすべての出現を置換します。 |
| [reset](./reset/)() | 文字列を null に設定します。C# の 'string_variable_name = null' と同等です。 |
| [SetCharAt](./setcharat/)(int, char_t) | 指定位置に文字を設定します。 |
| [Split](./split/)(char_t, StringSplitOptions) const | 文字で文字列を分割します。 |
| [Split](./split/)(char_t, int32_t, StringSplitOptions) const | 文字で文字列を分割します。 |
| [Split](./split/)(char_t, char_t, StringSplitOptions) const | 2 つの文字のいずれかで文字列を分割します。 |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, StringSplitOptions) const | 指定された文字のいずれかで文字列を分割します。 |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const | 指定された文字のいずれかで文字列を分割します。 |
| [Split](./split/)(const String\&, StringSplitOptions) const | 部分文字列で文字列を分割します。 |
| [Split](./split/)(const String\&, int, StringSplitOptions) const | 部分文字列で文字列を分割します。 |
| [Split](./split/)(const ArrayPtr\<String\>\&, StringSplitOptions) const | 部分文字列で文字列を分割します。 |
| [Split](./split/)(const ArrayPtr\<String\>\&, int, StringSplitOptions) const | 部分文字列で文字列を分割します。現在、0 または 1 要素の区切り文字配列のみサポートしています。 |
| [StartsWith](./startswith/)(const String\&) const | 文字列が指定された部分文字列で始まるかチェックします。 |
| [StartsWith](./startswith/)(const String\&, System::StringComparison) const | 文字列が指定された部分文字列で始まるかチェックします。 |
| [StartsWith](./startswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | 文字列が指定された部分文字列で始まるかチェックします。 |
| [String](./string/)() | デフォルトコンストラクタ。null と見なされる文字列オブジェクトを作成します。 |
| [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) | 文字列リテラルに基づいて文字列を構築します。リテラルを null 終端文字列とみなし、リテラルサイズに基づいて対象文字列の長さを計算します。 |
| [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) | 文字列ポインタに基づいて文字列を構築します。指された文字列を null 終端とみなし、null 文字に基づいて対象文字列の長さを計算します。 |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) | 文字列リテラルに基づいて文字列を構築します。リテラルを UTF8 の null 終端文字列とみなし、リテラルサイズに基づいて対象文字列の長さを計算します。 |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) | 文字列ポインタに基づいて文字列を構築します。指された文字列を UTF8 の null 終端とみなし、null 文字に基づいて対象文字列の長さを計算します。 |
| [String](./string/)(const char16_t *, int) | 文字列ポインタと明示的な長さから文字列を構築します。 |
| [String](./string/)(const char *, int) | 文字列ポインタと明示的な長さから文字列を構築します。 |
| [String](./string/)(const char16_t *, int, int) | 開始位置から長さを使用して文字列ポインタから文字列を構築します。 |
| explicit [String](./string/)(const char16_t, int) | フィルコンストラクタ。 |
| [String](./string/)(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) | nullptr コンストラクタ。他のテンプレートコンストラクタとの優先順位を解決するためにテンプレートとして宣言されています。 |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) | ワイド文字列リテラルに基づいて文字列を構築します。リテラルを null 終端文字列とみなし、リテラルサイズに基づいて対象文字列の長さを計算します。wchar_t からの変換は一部のプラットフォームで時間がかかるため、暗黙的な変換は許可されません。 |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) | ワイド文字列ポインタに基づいて文字列を構築します。指された文字列を null 終端とみなし、null 文字に基づいて対象文字列の長さを計算します。wchar_t からの変換は一部のプラットフォームで時間がかかるため、暗黙的な変換は許可されません。 |
| explicit [String](./string/)(const wchar_t *, int) | ワイド文字列ポインタと明示的な長さから文字列を構築します。wchar_t からの変換は一部のプラットフォームで時間がかかるため、暗黙的な変換は許可されません。 |
| explicit [String](./string/)(const wchar_t, int) | フィルコンストラクタ。wchar_t からの変換は一部のプラットフォームで時間がかかるため、暗黙的な変換は許可されません。 |
| [String](./string/)(const String\&) | コピーコンストラクタ。 |
| [String](./string/)(String\&&) | ムーブコンストラクタ。 |
| [String](./string/)(const ArrayPtr\<char16_t\>\&) | 文字配列全体を文字列に変換します。 |
| [String](./string/)(const ArrayPtr\<char16_t\>\&, int, int) | 文字配列のサブレンジを文字列に変換します。パラメータが配列の範囲外の場合、空の文字列が構築されます。 |
| explicit [String](./string/)(const codeporting_icu::UnicodeString\&) | UnicodeString を [String](./) にラップします。 |
| explicit [String](./string/)(codeporting_icu::UnicodeString\&&) | ムーブコンストラクタ。 |
| explicit [String](./string/)(const std::wstring\&) | widestringから [String](./) を作成します。 |
| explicit [String](./string/)(const std::u16string\&) | utf16文字列から [String](./) を作成します。 |
| explicit [String](./string/)(const std::string\&) | UTF-8 形式で提示された std::string 文字列から [String](./) を作成します。 |
| explicit [String](./string/)(const std::u32string\&) | std::u32string 文字列から [String](./) を作成します。 |
| [Substring](./substring/)(int32_t) const | 部分文字列を抽出します。 |
| [Substring](./substring/)(int32_t, int32_t) const | 部分文字列を抽出します。 |
| [ToAsciiString](./toasciistring/)() const | 文字列を std::string に変換します。ASCII エンコーディングを使用します。 |
| [ToByteArray](./tobytearray/)(int32_t, int32_t, bool) const | 文字列または部分文字列をバイト配列に変換します。 |
| [ToCharArray](./tochararray/)(int32_t, int32_t) const | 文字列またはサブ文字列を文字の配列に変換します。 |
| [ToLower](./tolower/)() const | 文字列のすべての文字を小文字に変換します。 |
| [ToLower](./tolower/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | 特定のカルチャーを使用して文字列のすべての文字を小文字に変換します。 |
| [ToLowerInvariant](./tolowerinvariant/)() const | 不変カルチャーを使用して文字列のすべての文字を小文字に変換します。 |
| [ToString](./tostring/)() const | 値型オブジェクトで [ToString()](./tostring/) が呼び出されるコンテキストで、[String](./) クラスを扱うためのラッパーです。 |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | 値型オブジェクトで [ToString()](./tostring/) が呼び出されるコンテキストで、[String](./) クラスを扱うためのラッパーです。 |
| [ToU16Str](./tou16str/)() const | 文字列を std::u16string に変換します。 |
| [ToU32Str](./tou32str/)() const | 文字列を std::u32string に変換します。 |
| [ToUpper](./toupper/)() const | 文字列のすべての文字を大文字に変換します。 |
| [ToUpper](./toupper/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | 特定のカルチャーを使用して文字列のすべての文字を大文字に変換します。 |
| [ToUpperInvariant](./toupperinvariant/)() const | 不変カルチャーを使用して文字列のすべての文字を大文字に変換します。 |
| [ToUtf8String](./toutf8string/)() const | 文字列を std::string に変換します。UTF-8 エンコーディングを使用します。 |
| [ToWCS](./towcs/)() const | 文字列を std::wstring に変換します。 |
| [Trim](./trim/)() const | 文字列の先頭と末尾の両方からすべての空白文字を削除します。 |
| [Trim](./trim/)(char_t) const | 文字列の先頭と末尾の両方から渡された文字のすべての出現を削除します。 |
| [Trim](./trim/)(const String\&) const | 文字列の先頭と末尾の両方から渡された文字群のすべての出現を削除します。 |
| [Trim](./trim/)(const ArrayPtr\<char_t\>\&) const | 文字列の先頭と末尾の両方から渡された文字群のすべての出現を削除します。 |
| [TrimEnd](./trimend/)() const | 文字列の末尾からすべての空白文字を削除します。 |
| [TrimEnd](./trimend/)(char_t) const | 文字列の末尾から渡された文字のすべての出現を削除します。 |
| [TrimEnd](./trimend/)(const String\&) const | 文字列の末尾から渡された文字群のすべての出現を削除します。 |
| [TrimEnd](./trimend/)(const ArrayPtr\<char_t\>\&) const | 文字列の末尾から渡された文字群のすべての出現を削除します。 |
| [TrimStart](./trimstart/)() const | 文字列の先頭からすべての空白文字を削除します。 |
| [TrimStart](./trimstart/)(char_t) const | 文字列の先頭から渡された文字のすべての出現を削除します。 |
| [TrimStart](./trimstart/)(const String\&) const | 文字列の先頭から渡された文字群のすべての出現を削除します。 |
| [TrimStart](./trimstart/)(const ArrayPtr\<char_t\>\&) const | 文字列の先頭から渡された文字群のすべての出現を削除します。 |
| [u_str](./u_str/)() const | ICU 形式の null 終端バッファを返します。文字列を再割り当てする場合があります。 |
| [~String](./~string/)() | デストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](./empty/) | 空文字列です。 |
| static [Null](./null/) | null 文字列です。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [reverse_iterator](./reverse_iterator/) | 逆イテレータ型。 |
## 備考



```cpp
#include "system/string.h"
#include <iostream>

int main()
{
  // 文字の配列から文字列を構築し、出力します。
  const auto chars = {u'h', u'e', u'l', u'l', u'o'};
  const System::String string1(chars);
  std::cout << string1 << std::endl;

  // バイト配列から文字列を作成し、出力します。
  const uint8_t bytes[] = {0x77, 0x6f, 0x72, 0x6c, 0x64, 0x0};
  const auto string2 = System::String::FromUtf8(bytes);
  std::cout << string2 << std::endl;

  // 以下の文字列をトリムして出力します。
  const System::String string3(u"   This string contains whitespaces in the beginning and at the end.   ");
  std::cout << '"' << string3.Trim() << '"' << std::endl;

  // 文の単語数を出力します。
  std::cout << "Number of words: " << string3.Trim().Split(' ')->get_Length() << std::endl;

  return 0;
}
/*
This code example produces the following output:
hello
world
"This string contains whitespaces in the beginning and at the end."
Number of words: 11
*/
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
