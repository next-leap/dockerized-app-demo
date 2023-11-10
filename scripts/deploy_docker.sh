echo "Building image"
docker build --no-cache --tag=anirudh1994/dockerdemo .

echo "Pushing image to docker hub"
docker push anirudh1994/dockerdemo