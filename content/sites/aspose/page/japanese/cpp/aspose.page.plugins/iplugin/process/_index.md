---
title: "Aspose::Page::Plugins::IPlugin::Process メソッド"
linktitle: "Process"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::Plugins::IPlugin::Process メソッド。C++ で定義されたオプションを使用してプラグインに処理させます。"
type: docs
weight: 100
url: /ja/cpp/aspose.page.plugins/iplugin/process/
---
## IPlugin::Process method


プラグインに定義されたオプションで処理させます。

```cpp
virtual System::SharedPtr<ResultContainer> Aspose::Page::Plugins::IPlugin::Process(System::SharedPtr<IPluginOptions> options)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| options | System::SharedPtr\<IPluginOptions\> | プラグインへの指示を含む options オブジェクトです。 |

### ReturnValue

処理結果を含む [ResultContainer](../../resultcontainer/) オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ResultContainer](../../resultcontainer/)
* Class [IPluginOptions](../../ipluginoptions/)
* Class [IPlugin](../)
* Namespace [Aspose::Page::Plugins](../../)
* Library [Aspose.Page for C++](../../../)
