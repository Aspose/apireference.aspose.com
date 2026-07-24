---
title: "IPlugin"
second_title: "Aspose.Page용 Java API 참조"
description: "구체적인 플러그인이 구현해야 하는 공통 메서드를 정의하는 일반 플러그인 인터페이스."
type: docs
weight: 23
url: /ko/java/com.aspose.page.plugins/iplugin/
---```
public interface IPlugin
```

General plugin interface that defines common methods that concrete plugin should implement.
## Methods

| Method | Description |
| --- | --- |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Charges a plugin to process with defined options |
### process(IPluginOptions options) {#process-com.aspose.page.plugins.IPluginOptions-}
```
public abstract ResultContainer process(IPluginOptions options)
```


Charges a plugin to process with defined options

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | An options object containing instructions for the plugin |

**Returns:**
[ResultContainer](../../com.aspose.page.plugins/resultcontainer) - An ResultContainer object containing the result of the processing
