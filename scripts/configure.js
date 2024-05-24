require('dotenv').config()
const path = require('node:path')
const fs = require('node:fs/promises')
const yaml = require('js-yaml')

async function main() {
    await configure_one_language()
    await configure_one_product()

    console.info('Saving configuration to', config_file)
    await fs.writeFile(config_file, JSON.stringify(config, null, 4))
}

async function configure_one_language() {
    if (!process.env.hasOwnProperty('CONFIGURE_ONE_LANGUAGE')) {
        return
    }
    if (process.env.CONFIGURE_ONE_LANGUAGE.length !== 2) {
        return
    }

    config.disableLanguages = Object.keys(yaml.load(await fs.readFile(languages_file), {}))
        .filter(l => l !== process.env.CONFIGURE_ONE_LANGUAGE && l !== 'en')
    config.one_language = process.env.CONFIGURE_ONE_LANGUAGE
}

async function configure_one_product() {
    if (!process.env.hasOwnProperty('CONFIGURE_ONE_PRODUCT')) {
        return
    }
    if (process.env.CONFIGURE_ONE_PRODUCT.length < 3) {
        return
    }

    const exclusion = (await Promise.all((await fs.readdir(content_dir))
        .filter(f => f !== process.env.CONFIGURE_ONE_PRODUCT)
        .map(async f => ({
            name: f,
            stat: await fs.stat(path.join(content_dir, f))
        }))
    ))
        .filter(f => f.stat.isDirectory())
        .map(f => f.name)

    config.ignoreFiles = exclusion.map(i => `^${i}/`)
    config.one_product = process.env.CONFIGURE_ONE_PRODUCT
}

const project_dir = path.dirname(__dirname)
const languages_file = path.join(project_dir, 'config', '_default', 'languages.yaml')
const content_dir = path.join(project_dir, 'content', 'sites', 'aspose', process.env.CONFIGURE_FAMILY, 'english')
const config_file = path.join(project_dir, 'config.json')
let config = {}

;(async () => await main())()
