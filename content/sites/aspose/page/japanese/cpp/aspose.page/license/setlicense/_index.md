---
title: "Aspose::Page::License::SetLicense メソッド"
linktitle: "SetLicense"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::License::SetLicense メソッド。C++ でコンポーネントにライセンスを設定します。"
type: docs
weight: 400
url: /ja/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


コンポーネントにライセンスを付与します。

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | System::SharedPtr\<System::IO::Stream\> | ライセンスが含まれるストリーム。 |
## 備考



このメソッドを使用して、ストリームからライセンスをロードします。

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


コンポーネントにライセンスを付与します。

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## 備考


以下の場所でライセンスを検索します：

1. 明示的なパス。

<ms>

2. コンポーネント アセンブリのフォルダー。

3. クライアントの呼び出しアセンブリのフォルダー。

4. エントリ アセンブリのフォルダー。

5. クライアントの呼び出しアセンブリに埋め込まれたリソース。

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. 明示的なパス。

2. クライアントの呼び出しアセンブリに埋め込まれたリソース。

</ms>

<java>

2. コンポーネント JAR ファイルのフォルダー。

</java>
## 参照

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
