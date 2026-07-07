---
title: AsposeAI
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 20
url: /python-net/aspose.ocr.ai/asposeai/
---

## AsposeAI class

Main API for the AI component in the Aspose OCR library.<br/>            Provides integration with AI-powered postprocessors such as spell-checking,<br/>            table extraction, and layout correction.

The AsposeAI type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
|AsposeAI()|Initializes a new instance of the AsposeAI class with default settings.<br/>            Automatic model downloads are enabled.|
|AsposeAI(logging)|Initializes a new instance of the AsposeAI class|
## Methods
| Name | Description |
| :- | :- |
|run_postprocessor(res)|Applies registered AI post-processor to the given structured OCR result.<br/>            This may include spelling correction, table detection, table formatting,<br/>            and other AI-powered enhancements depending on the configured processors.|
|run_postprocessor(res)|  |
|is_initialized()|Checks whether the AI engine has been initialized.|
|set_post_processor(processor, custom_settings)|Adds an AI postprocessor to be applied to OCR results.<br/>            If|
|get_local_path()|Gets the currently configured local model directory path.|
|list_local()|Lists all local models available in the configured directory.|
|free_resources()|Releases all AI-related resources and disposes loaded models.|

### See Also

* namespace [aspose.ocr.ai](/ocr/python-net/aspose.ocr.ai/)
* assembly [Aspose.ocr](/ocr/python-net/)

