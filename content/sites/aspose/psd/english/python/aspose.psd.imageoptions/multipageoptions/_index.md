---
title: MultiPageOptions Class
type: docs
weight: 70
url: /python-net/aspose.psd.imageoptions/multipageoptions/
---

**Summary:** Base class for multiple pages supported formats

**Module:** [aspose.psd.imageoptions](/psd/python-net/aspose.psd.imageoptions/)

**Full Name:** aspose.psd.imageoptions.MultiPageOptions

**Aspose.PSD Version:** 24.12.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [MultiPageOptions()](#MultiPageOptions__1) | Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class. |
| [MultiPageOptions(page)](#MultiPageOptions_page_2) | Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class. |
| [MultiPageOptions(page, export_area)](#MultiPageOptions_page_export_area_3) | Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class. |
| [MultiPageOptions(page_titles)](#MultiPageOptions_page_titles_4) | Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class. |
| [MultiPageOptions(page_titles, export_area)](#MultiPageOptions_page_titles_export_area_5) | Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class. |
| [MultiPageOptions(pages)](#MultiPageOptions_pages_6) | Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class. |
| [MultiPageOptions(pages, export_area)](#MultiPageOptions_pages_export_area_7) | Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class. |
| [MultiPageOptions(range)](#MultiPageOptions_range_8) | Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class. |
| [MultiPageOptions(range, export_area)](#MultiPageOptions_range_export_area_9) | Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class. |
| [MultiPageOptions(ranges)](#MultiPageOptions_ranges_10) | Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class. |
| [MultiPageOptions(ranges, export_area)](#MultiPageOptions_ranges_export_area_11) | Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| export_area | [Rectangle](/psd/python-net/aspose.psd/rectangle) | r/w | Gets or sets the export area. |
| merge_layers | bool | r/w | Gets or sets a value indicating whether [merege layers]. |
| mode | [MultiPageMode](/psd/python-net/aspose.psd.imageoptions/multipagemode) | r/w | Gets or sets the mode. |
| output_layers_names | string | r/w | Gets or sets the output layers names(Works if export format supports layers naming, for example for Psd) |
| page_rasterization_options | [VectorRasterizationOptions[]](/psd/python-net/aspose.psd.imageoptions/vectorrasterizationoptions) | r/w | Gets or sets the page rasterization options. |
| page_titles | string | r/w | Gets or sets the page titles. |
| pages | int | r/w | Gets or sets the pages. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [init_pages(ranges)](#init_pages_ranges_1) | Initializes the pages from ranges array |


### Constructor: MultiPageOptions() {#MultiPageOptions__1}


```
 MultiPageOptions() 
```

Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class.

### Constructor: MultiPageOptions(page) {#MultiPageOptions_page_2}


```
 MultiPageOptions(page) 
```

Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| page | int |  |

### Constructor: MultiPageOptions(page, export_area) {#MultiPageOptions_page_export_area_3}


```
 MultiPageOptions(page, export_area) 
```

Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| page | int |  |
| export_area | [Rectangle](/psd/python-net/aspose.psd/rectangle) | The export area. |

### Constructor: MultiPageOptions(page_titles) {#MultiPageOptions_page_titles_4}


```
 MultiPageOptions(page_titles) 
```

Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| page_titles | string | The page titles. |

### Constructor: MultiPageOptions(page_titles, export_area) {#MultiPageOptions_page_titles_export_area_5}


```
 MultiPageOptions(page_titles, export_area) 
```

Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| page_titles | string | The page titles. |
| export_area | [Rectangle](/psd/python-net/aspose.psd/rectangle) | The export area. |

### Constructor: MultiPageOptions(pages) {#MultiPageOptions_pages_6}


```
 MultiPageOptions(pages) 
```

Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| pages | int | The pages. |

### Constructor: MultiPageOptions(pages, export_area) {#MultiPageOptions_pages_export_area_7}


```
 MultiPageOptions(pages, export_area) 
```

Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| pages | int | The array of pages. |
| export_area | [Rectangle](/psd/python-net/aspose.psd/rectangle) | The export area. |

### Constructor: MultiPageOptions(range) {#MultiPageOptions_range_8}


```
 MultiPageOptions(range) 
```

Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| range | [IntRange](/psd/python-net/aspose.psd/intrange) |  |

### Constructor: MultiPageOptions(range, export_area) {#MultiPageOptions_range_export_area_9}


```
 MultiPageOptions(range, export_area) 
```

Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| range | [IntRange](/psd/python-net/aspose.psd/intrange) |  |
| export_area | [Rectangle](/psd/python-net/aspose.psd/rectangle) | The export area. |

### Constructor: MultiPageOptions(ranges) {#MultiPageOptions_ranges_10}


```
 MultiPageOptions(ranges) 
```

Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| ranges | [IntRange[]](/psd/python-net/aspose.psd/intrange) | The [IntRange](/psd/python-net/aspose.psd/intrange/). |

### Constructor: MultiPageOptions(ranges, export_area) {#MultiPageOptions_ranges_export_area_11}


```
 MultiPageOptions(ranges, export_area) 
```

Initializes a new instance of the [MultiPageOptions](/psd/python-net/aspose.psd.imageoptions/multipageoptions/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| ranges | [IntRange[]](/psd/python-net/aspose.psd/intrange) | The [IntRange](/psd/python-net/aspose.psd/intrange/). |
| export_area | [Rectangle](/psd/python-net/aspose.psd/rectangle) | The export area. |

### Method: init_pages(ranges) {#init_pages_ranges_1}


```
 init_pages(ranges) 
```

Initializes the pages from ranges array

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| ranges | [IntRange[]](/psd/python-net/aspose.psd/intrange) | The ranges. |

