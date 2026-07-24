---
title: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption クラス"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption クラス。C++ で PageDeviceColorSpaceUsage 機能オプションを説明します。"
type: docs
weight: 200
url: /ja/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


[PageDeviceColorSpaceUsage](../) 機能オプションを説明します。

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## フィールド

| フィールド | 説明 |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | デバイスが、[PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) パラメータで指定されたプロファイルをデバイスカラースペースプロファイルとして使用できると判断した場合、同じプロファイルを使用するすべての要素は既にデバイスカラースペースで指定されているものとして扱われます。その他のすべての要素は、その要素に指定されたプロファイルを必ず使用しなければなりません。プロファイルをデバイスカラースペースプロファイルとして使用できない場合、プロファイルを使用する要素は、他のカラープロファイルを使用する要素と同様に必ずカラー管理されなければなりません。 |
| static [OverrideDeviceDefault](./overridedevicedefault/) | [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) パラメータで指定されたプロファイルのチャンネル数がデバイスのプライマリ数と一致する場合、すべての要素に対してデバイス内部のカラー管理の代わりに使用すべきです。このプロファイルを使用する要素はデバイスカラースペースにあるとみなされ、これ以上カラー管理されません。 |
## 参照

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
