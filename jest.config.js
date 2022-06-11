module.exports = {
    roots: ["<rootDir>/src/main/ts", "<rootDir>/src/test/ts"],
    modulePaths: ["<rootDir>/src/main/ts", "<rootDir>/node_modules"],
    transform: {
        "^.+\\.tsx?$": "ts-jest",
    },
};
