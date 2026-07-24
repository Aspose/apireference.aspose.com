---
title: "IPlugin"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Γενική διεπαφή πρόσθετου που ορίζει κοινές μεθόδους που πρέπει να υλοποιήσει το συγκεκριμένο πρόσθετο."
type: docs
weight: 23
url: /el/java/com.aspose.page.plugins/iplugin/
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
