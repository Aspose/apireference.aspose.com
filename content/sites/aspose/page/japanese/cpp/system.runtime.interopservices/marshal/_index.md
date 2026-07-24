---
title: "System::Runtime::InteropServices::Marshal クラス"
linktitle: "Marshal"
second_title: "C++ 用 Aspose.Page"
description: "System::Runtime::InteropServices::Marshal クラス。マーシャリング実装を提供します。C++側ではマネージドコードがサポートされていないため、翻訳されたコードとの互換性のためだけに使用されます。これはインスタンスサービスを持たない静的型です。C++ではいかなる手段でもインスタンスを作成すべきではありません。"
type: docs
weight: 100
url: /ja/cpp/system.runtime.interopservices/marshal/
---
## Marshal class


マーシャリング実装を提供します。C++ 側ではマネージドコードがサポートされていないため、翻訳されたコードとの互換性のためだけです。これはインスタンスサービスを持たない静的型です。いかなる手段でもインスタンスを作成すべきではありません。

```cpp
class Marshal
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [AllocHGlobal](./allochglobal/)(int32_t) | アンマネージドメモリを割り当てます。 |
| static [AllocHGlobal](./allochglobal/)(IntPtr) | アンマネージドメモリを割り当てます。 |
| static [Copy](./copy/)(const IntPtr, container\&&, int, int) | public static void Copy(IntPtr source, byte[] destination, int startIndex, int length) のセマンティクスを実装します。 |
| static [Copy](./copy/)(const void *, container\&&, int, int) | public static void Copy(IntPtr source, byte[] destination, int startIndex, int length) のセマンティクスを実装します。 |
| static [Copy](./copy/)(const container\&, int, void *, int) | public static void Copy(char[] source, int startIndex, IntPtr destination, int length) を実装します。 |
| static [Copy](./copy/)(const container\&, int, IntPtr, int) | public static void Copy(char[] source, int startIndex, IntPtr destination, int length) を実装します。 |
| static [FreeHGlobal](./freehglobal/)(IntPtr) | アンマネージドメモリを解放します。 |
| static [GetHRForException](./gethrforexception/)(const System::Exception\&) | 例外から HResult を取得します。 |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr) | アンマネージドのゼロ終端 UTF8 文字列から管理対象の [String](../../system/string/) を作成します。 |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr, int) | アンマネージド UTF8 文字列から管理対象の [String](../../system/string/) を作成します。 |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr) | アンマネージドのゼロ終端文字列から管理対象の [String](../../system/string/) を作成します。 |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr, int) | アンマネージド文字列から管理対象の [String](../../system/string/) を作成します。 |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr) | アンマネージドのゼロ終端 Unicode 文字列から管理対象の [String](../../system/string/) を作成します。 |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr, int) | アンマネージド Unicode 文字列から管理対象の [String](../../system/string/) を作成します。 |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr) | アンマネージドのゼロ終端 UTF8 文字列から管理対象の [String](../../system/string/) を作成します。 |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr, int) | アンマネージド UTF8 文字列から管理対象の [String](../../system/string/) を作成します。 |
| static [ReadByte](./readbyte/)(IntPtr, int) | メモリからバイトを読み取ります。 |
| static [ReadInt16](./readint16/)(IntPtr, int) | メモリからショートを読み取ります。 |
| static [ReadInt32](./readint32/)(IntPtr, int) | メモリから整数を読み取ります。 |
| static [SecureStringToGlobalAllocAnsi](./securestringtoglobalallocansi/)(const SharedPtr\<Security::SecureString\>\&) | 指定された SecureString の内容をアンマネージド メモリにコピーし、ANSI 形式に変換します。 |
| static [SecureStringToGlobalAllocUnicode](./securestringtoglobalallocunicode/)(const SharedPtr\<Security::SecureString\>\&) | 指定された SecureString の内容をアンマネージド メモリにコピーします。 |
| static [StringToHGlobalAnsi](./stringtohglobalansi/)(const String\&) | 指定された文字列の内容をアンマネージド メモリにコピーします。 |
| static [StringToHGlobalAuto](./stringtohglobalauto/)(const String\&) | 指定された文字列の内容をアンマネージド メモリにコピーし、必要に応じて ANSI 形式に変換します。 |
| static [StringToHGlobalUni](./stringtohglobaluni/)(const String\&) | 指定された文字列の内容をアンマネージド メモリにコピーします。 |
| static [WriteByte](./writebyte/)(IntPtr, int, uint8_t) | メモリにバイトを書き込みます。 |
| static [WriteByte](./writebyte/)(IntPtr, uint8_t) | メモリにバイトを書き込みます。 |
| static [WriteInt16](./writeint16/)(IntPtr, int, int16_t) | メモリにショートを書き込みます。 |
| static [WriteInt32](./writeint32/)(IntPtr, int, int32_t) | メモリに整数を書き込みます。 |
| static [WriteInt64](./writeint64/)(IntPtr, int, int64_t) | メモリに長整数を書き込みます。 |
| static [ZeroFreeGlobalAllocAnsi](./zerofreeglobalallocansi/)(IntPtr) | SecureStringToGlobalAllocAnsi メソッドで割り当てられたアンマネージド文字列ポインタを解放します。 |
| static [ZeroFreeGlobalAllocUnicode](./zerofreeglobalallocunicode/)(IntPtr) | SecureStringToGlobalAllocUnicode メソッドで割り当てられたアンマネージド文字列ポインタを解放します。 |
## 参照

* Namespace [System::Runtime::InteropServices](../)
* Library [Aspose.Page for C++](../../)
