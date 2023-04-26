---
title: Class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.PageDeviceColorSpaceUsagePageDeviceColorSpaceUsageOption クラス. はPageDeviceColorSpaceUsage機能オプション.
type: docs
weight: 1950
url: /ja/net/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption class

は、[`PageDeviceColorSpaceUsage`](../pagedevicecolorspaceusage/)機能オプション.

```csharp
public sealed class PageDeviceColorSpaceUsageOption : Option
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 要素名を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/option/add/)(params IOptionItem[]) | このオプションの項目リストの最後に項目のリストを追加します。 それぞれが[`ScoredProperty`](../scoredproperty/)また[`Property`](../property/)インスタンス. |

## 田畑

| 名前 | 説明 |
| --- | --- |
| static [MatchToDefault](../../aspose.page.xps.xpsmetadata/pagedevicecolorspaceusageoption/matchtodefault/) | デバイスが、[`PageDeviceColorSpaceProfileURI`](../pagedevicecolorspaceprofileuri/) parameter は、デバイスの色空間プロファイルとして使用できます。同じプロファイルを使用するすべての要素は、デバイスの色空間で既に指定されている として扱われます。他のすべての要素は、その要素に指定されたプロファイルを使用する必要があります。プロファイルが デバイス カラー スペース プロファイルとして使用できない場合、プロファイルを使用する要素は、カラー プロファイルを使用する他の要素と同様に色を管理する必要があります. |
| static [OverrideDeviceDefault](../../aspose.page.xps.xpsmetadata/pagedevicecolorspaceusageoption/overridedevicedefault/) | PageDeviceColorSpaceProfileURI パラメータで指定されたプロファイルに、デバイスのプライマリの数 に一致するチャネル数がある場合、すべての要素のデバイス内部カラー管理の代わりに使用する必要があります. このプロファイルを使用する要素は、デバイスの色であると見なされます。スペースがあり、それ以上カラー管理されません. |

### 関連項目

* class [Option](../option/)
* class [PageDeviceColorSpaceUsage](../pagedevicecolorspaceusage/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


