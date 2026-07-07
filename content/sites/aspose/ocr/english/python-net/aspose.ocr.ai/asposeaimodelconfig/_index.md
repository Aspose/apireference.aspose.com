---
title: AsposeAIModelConfig
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 30
url: /python-net/aspose.ocr.ai/asposeaimodelconfig/
---

## AsposeAIModelConfig class

Represents configuration settings for loading an LLM model.

The AsposeAIModelConfig type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
|AsposeAIModelConfig()|Initializes a new instance of the AsposeAIModelConfig class|
## Properties
| Name | Description |
| :- | :- |
|hugging_face_repo_id|ID of the model on HuggingFace (e.g., "openai/gpt2"). If specified, the model will be downloaded from HuggingFace.<br/>            Default bartowski/Qwen2.5-3B-Instruct-GGUF.|
|directory_model_path|Optional path where downloaded or processed models will be cached.<br/>            If not set, a default system location will be used.|
|allow_auto_download|If true, the model will be automatically downloaded if not available locally.|
|hugging_face_file_name|Optional model's name to use when downloading from HuggingFace.<br/>            Examples: "TableGPT2-7B.Q4_K_S.gguf". <br/>            Default for table AI - TableGPT2-7B.Q4_K_S.gguf.|
|file_model_path|Local path to the folder containing the model files. If specified, this will be used instead of downloading.<br/>            Default empty.|
|context_size|Defines the maximum number of tokens the LLM can use as context during inference. <br/>            If null, the default context size defined by the model will be used.<br/>            Larger values allow the model to consider more text but may require more memory.|
|gpu_layers|Number of GPU layers to use for the model. If not specified, the default value (40) will be used. Set to 0 to run entirely on the CPU.|

### See Also

* namespace [aspose.ocr.ai](/ocr/python-net/aspose.ocr.ai/)
* assembly [Aspose.ocr](/ocr/python-net/)

