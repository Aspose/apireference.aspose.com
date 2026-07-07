---
title: OnnxRuntimeSessionOptions
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 270
url: /python-net/aspose.ocr/onnxruntimesessionoptions/
---

## OnnxRuntimeSessionOptions class

Configuration options for creating ONNX InferenceSession.<br/>            We recommend keeping the optimized defaults unless you are absolutely certain about the modifications. For technical details, refer to ONNX Runtime documentation.

The OnnxRuntimeSessionOptions type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
|set_graph_optimization_level|Graph optimization level for the session. By default, all available optimizations are enabled for maximum performance.|
|set_execution_mode|Execution mode for the session. By default, operators are executed concurrently, whenever possible.|
|set_intra_op_num_threads|Number of threads for a single operations.|
|set_inter_op_num_threads|Number of threads for running multiple operations in parallel. If sequential execution (ExecutionModeOnnx.ORT_SEQUENTIAL) is enabled in ExecutionMode property, this value is ignored.|
|set_enable_cpu_mem_arena|Enables or disables the CPU memory arena allocator used by ONNX Runtime.<br/>            When enabled, memory is pooled and reused for better performance,<br/>            but may lead to increased memory consumption in multi-threaded scenarios.<br/>            Disable to reduce peak memory usage at the cost of performance.|
|set_enable_memory_pattern|Enables or disables memory pattern optimization for input tensors.<br/>            When enabled, ONNX Runtime caches memory allocation patterns for faster execution,<br/>            but may increase memory usage for dynamic input shapes.<br/>            Disable if inputs vary significantly or to reduce memory footprint.|

### See Also

* namespace [aspose.ocr](/ocr/python-net/aspose.ocr/)
* assembly [Aspose.ocr](/ocr/python-net/)

