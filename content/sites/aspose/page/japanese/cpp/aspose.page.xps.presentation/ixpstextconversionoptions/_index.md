---
title: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions クラス"
linktitle: "IXpsTextConversionOptions"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions クラス。C++ で XPS を他の形式に変換するためのオプションを定義します。"
type: docs
weight: 300
url: /ja/cpp/aspose.page.xps.presentation/ixpstextconversionoptions/
---
## IXpsTextConversionOptions class


[XPS](../../aspose.page.xps/) を他の形式に変換するためのオプションを定義します。

```cpp
class IXpsTextConversionOptions : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_PreserveText](./get_preservetext/)() | [XPS](../../aspose.page.xps/) では、フォント内の文字コードに対応しない代替グリフ形への参照を含むテキスト要素が存在する場合があります。このフラグが true に設定されている場合、該当する [XPS](../../aspose.page.xps/) 要素のテキストはグラフィックシェイプに変換され、テキスト自体は上に透明に表示されます。これにより、その要素のテキストは選択可能なまま残りますが、出力ファイルのサイズが元より大幅に大きくなるという副作用があります。フラグが false に設定されている場合、代替形として表示すべき文字は他の文字に置き換えられ、代替グリフ形にマッピングされます。そのため、テキストは依然として選択可能ですが、内容が変更され、ほぼ読めなくなる可能性があります。 |
| virtual [set_PreserveText](./set_preservetext/)(bool) | [XPS](../../aspose.page.xps/) では、フォント内の文字コードに対応しない代替グリフ形への参照を含むテキスト要素が存在する場合があります。このフラグが true に設定されている場合、該当する [XPS](../../aspose.page.xps/) 要素のテキストはグラフィックシェイプに変換され、テキスト自体は上に透明に表示されます。これにより、その要素のテキストは選択可能なまま残りますが、出力ファイルのサイズが元より大幅に大きくなるという副作用があります。フラグが false に設定されている場合、代替形として表示すべき文字は他の文字に置き換えられ、代替グリフ形にマッピングされます。そのため、テキストは依然として選択可能ですが、内容が変更され、ほぼ読めなくなる可能性があります。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation](../)
* Library [Aspose.Page for C++](../../)
