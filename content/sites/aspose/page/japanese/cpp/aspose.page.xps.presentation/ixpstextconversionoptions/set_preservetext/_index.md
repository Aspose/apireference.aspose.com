---
title: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions::set_PreserveText メソッド"
linktitle: "set_PreserveText"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions::set_PreserveText メソッド。XPS では、一部のテキスト要素がフォントの文字コードに対応しない代替グリフ形への参照を含むことがあります。このフラグが true に設定されている場合、該当する XPS 要素のテキストはグラフィックシェイプに変換され、テキスト自体は上に透明に表示されます。これによりその要素のテキストは選択可能なままになりますが、出力ファイルが元よりはるかに大きくなる副作用があります。このフラグが false に設定されている場合、代替形として表示すべき文字は別の文字に置き換えられ、代替グリフ形にマッピングされます。したがってテキストは選択可能ですが、変更されており、C++ では読めなくなる可能性があります。"
type: docs
weight: 200
url: /ja/cpp/aspose.page.xps.presentation/ixpstextconversionoptions/set_preservetext/
---
## IXpsTextConversionOptions::set_PreserveText method


[XPS](../../../aspose.page.xps/) では、一部のテキスト要素がフォントの文字コードに対応しない代替グリフ形への参照を含むことがあります。このフラグが true に設定されている場合、該当する [XPS](../../../aspose.page.xps/) 要素のテキストはグラフィックシェイプに変換され、テキスト自体は上に透明に表示されます。これによりその要素のテキストは選択可能なままになりますが、副作用として出力ファイルが元よりはるかに大きくなる可能性があります。このフラグが false に設定されている場合、代替形として表示すべき文字は別の文字に置き換えられ、代替グリフ形にマッピングされます。したがってテキストは選択可能ですが、変更されており、読めなくなる可能性があります。

```cpp
virtual void Aspose::Page::XPS::Presentation::IXpsTextConversionOptions::set_PreserveText(bool value)=0
```

## 参照

* Class [IXpsTextConversionOptions](../)
* Namespace [Aspose::Page::XPS::Presentation](../../)
* Library [Aspose.Page for C++](../../../)
