---
title: "Aspose::Page::Plugins::IPlugin::Process 方法"
linktitle: "Process"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::Plugins::IPlugin::Process 方法。指示插件使用已定义的选项在 C++ 中进行处理。"
type: docs
weight: 100
url: /zh/cpp/aspose.page.plugins/iplugin/process/
---
## IPlugin::Process method


指派插件使用已定义的选项进行处理。

```cpp
virtual System::SharedPtr<ResultContainer> Aspose::Page::Plugins::IPlugin::Process(System::SharedPtr<IPluginOptions> options)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 选项 | System::SharedPtr\<IPluginOptions\> | 一个包含插件指令的选项对象。 |

### ReturnValue

一个包含处理结果的 [ResultContainer](../../resultcontainer/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ResultContainer](../../resultcontainer/)
* Class [IPluginOptions](../../ipluginoptions/)
* Class [IPlugin](../)
* Namespace [Aspose::Page::Plugins](../../)
* Library [Aspose.Page for C++](../../../)
