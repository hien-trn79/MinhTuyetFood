import axios from "axios";

const commnonConfig = {
  headers: {
    "Content-Type": "application/json",
    Accept: "application/json",
  },
};

export const jsonClient = (baseURL) => {
  return axios.create({
    baseURL,
    headers: commnonConfig.headers,
  });
};

export const formClient = (baseURL) => {
  return axios.create({
    baseURL,
    headers: commnonConfig.headers,
  });
};
